/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> emap = new HashMap<>();
        
        for(Employee emp: employees){
            emap.put(emp.id,emp);
        }
        
        Queue<Employee> queue = new LinkedList<>();
        
        queue.add(emap.get(id));
        
        int imp=0;
        
        while(queue.size()>0){
            Employee emp = queue.poll();
            
            imp += emp.importance;
            
            for(int sid: emp.subordinates){
                queue.add(emap.get(sid));
            }
            
        }
        
        return imp;
    }
}