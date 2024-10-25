class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> rootFolders = new HashSet<>(); 
        Arrays.sort(folder);
        
        for (String f : folder) {
            StringBuilder temp = new StringBuilder("/"); 
            boolean isSubfolder = false;
            
            for (int i = 1; i < f.length(); i++) {
                if (f.charAt(i) != '/') {
                    temp.append(f.charAt(i));
                } else {
                    if (rootFolders.contains(temp.toString())) { 
                        isSubfolder = true;
                        break;
                    }
                    temp.append('/'); 
                }
            }
            
            if (!isSubfolder) {
                rootFolders.add(f); 
            }
        }
        
        return new ArrayList<>(rootFolders);
    }
}
