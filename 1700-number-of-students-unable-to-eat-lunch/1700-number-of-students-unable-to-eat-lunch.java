class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int Czero=0;
        int Cone=0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                Czero++;
            }
            else{
                Cone++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(Czero==0){
                    return Cone;
                }
                Czero--;
            }
            else{
                if(Cone==0){
                    return Czero;
                }
                Cone--;
            }
        }
        return 0;
    }
}