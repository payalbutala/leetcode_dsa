class Solution {
    public static boolean isLongPressedName(String name, String typed) {
        int p1 = 0;
        int p2 = 0;
        int N = name.length();
        int nameCount = 0;
        int typedStrCount = 0;
        String nameStr = "";
        String nameNextStr = "";
        String typedStr = "";

        if(typed.length() < N){
            return false;
        }

        for (int i = 0; i < N; i++) {
            nameStr = "" + name.charAt(i);
            nameNextStr = "";
            nameCount++;

            if (i < N - 1) {
                nameNextStr = "" + name.charAt(i + 1);
            }

            while (nameStr.equals(nameNextStr)) {
                i++;
                nameCount++;
                if (i < N) {
                    nameStr = "" + name.charAt(i);
                } else {
                    nameStr = "";
                }

                if (i < N - 1) {
                    nameNextStr = "" + name.charAt(i + 1);
                } else {
                    nameNextStr = "";
                }
            }

            if(p2 < typed.length()) {
                typedStr = "" + typed.charAt(p2);
            }
            // typedStrCount++;
            while (p2 < typed.length() && typedStr.equals(nameStr)) {
                typedStrCount++;
                p2++;
                if (p2 < typed.length()) {
                    typedStr = "" + typed.charAt(p2);
                }
            }

            if (nameCount > typedStrCount) {
                return false;
            }
            typedStrCount = 0;
            nameCount = 0;

        }

        if (!nameStr.equals(typedStr)) {
            return false;
        }

        return true;
    }
}
