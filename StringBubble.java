public class StringBubble {
    public String[] bubbleSort(String[] words){

        boolean unsorted = true;
        String temp;
        int length = 0;
        int count = 0;
        while (unsorted)
        {
            unsorted= false;
            for(int i =0;  i < words.length -1;  i++ )
            {
                for(int j=0; j < words[i].length() && j < words[i+1].length(); j++){
                    if ( Character.toLowerCase(words[i].charAt(j)) >  Character.toLowerCase(words[i+1].charAt(j)))
                    {
                        temp = words[i];
                        words[i] = words[i+1];
                        words[i+1] = temp;
                        unsorted = true;
                        break;
                    }
                    else if( Character.toLowerCase(words[i].charAt(j)) <  Character.toLowerCase(words[i+1].charAt(j))){
                        break;
                    }
                    else if( Character.toLowerCase(words[i].charAt(j)) ==  Character.toLowerCase(words[i+1].charAt(j))){
                        count ++;
                        if(count == words[i].length() || count == words[i+1].length()){
                            if(words[i].length() > words[i+1].length()){
                                temp = words[i];
                                words[i] = words[i+1];
                                words[i+1] = temp;
                                unsorted = true;
                                break;
                            }
                        }
                    }
                }
                count = 0;

            }
        }
        return words;
    }
}
