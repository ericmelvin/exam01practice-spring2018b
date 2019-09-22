package exam01;
import java.util.ArrayList;
import java.util.List;
public class ListUtil {
    public static List < Integer > exclusiveSum(List < Integer > list) {
		// exclusive sum: add up all integers except i in list add result to new list
		
		List<Integer> exclusiveSumList = new ArrayList<>();
		
		// Loop over list - list.size() times
		for (int i = 0; i<list.size(); i++) {
			int sum = 0;
			for (int j=0; j<list.size(); j++) {
				if (j != i) {
					sum += list.get(j);
				}
			}
			// Add sum to list
			exclusiveSumList.add(sum);
		
        }
		
		return exclusiveSumList;
    }
}