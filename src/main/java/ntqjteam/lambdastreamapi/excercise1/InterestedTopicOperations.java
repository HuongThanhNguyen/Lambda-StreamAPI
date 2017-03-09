package ntqjteam.lambdastreamapi.excercise1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by toan on 3/1/17.
 */
public class InterestedTopicOperations {

    public static void main(String[] args) {
    	Topic topic1=new Topic("1", "topic 1", "description 1");
    	Topic topic2=new Topic("2", "topic 2", "description 2");
    	Topic topic3=new Topic("3", "topic 3", "description 3");
    	Topic topic4=new Topic("4", "topic 4", "description 4");
    	Topic topic5=new Topic("5", "topic 5", "description 5");
    	Topic topic6=new Topic("6", "topic 6", "description 6");
    	Topic topic7=new Topic("7", "topic 7", "description 7");
    	Topic topic8=new Topic("8", "topic 8", "description 8");
    	Topic topic9=new Topic("9", "topic 9", "description 9");
    	Topic topic10=new Topic("10", "topic 10", "description 10");
    	Topic topic11=new Topic("11", "topic 11", "description 11");
    	

        List<Topic> currentTopics=Arrays.asList(topic1,topic2,topic3,topic4,topic5,topic6,topic7,topic8); // needs initializing
        System.out.println("Current topics");
        printlnListTopic(currentTopics);
        List<Topic> updatingTopics=Arrays.asList(topic4,topic5,topic6,topic7,topic8,topic9,topic10,topic11); // needs initializing
        System.out.println("updating topics");
        printlnListTopic(updatingTopics);

        // Find out these groups of topics from currentTopics and updatingTopics
        List<Topic> addedTopics=updatingTopics.stream().filter(topic->currentTopics.contains(topic)==false).collect(Collectors.toList());
        System.out.println("added topics");
        printlnListTopic(addedTopics);
        List<Topic> updatedTopics=updatingTopics.stream().filter(topic->currentTopics.contains(topic)==true).collect(Collectors.toList());
        System.out.println("updated topics");
        printlnListTopic(updatedTopics);
        List<Topic> deletedTopics=currentTopics.stream().filter(topic->updatingTopics.contains(topic)==false).collect(Collectors.toList());
        System.out.println("deleted topics");
        printlnListTopic(deletedTopics);

    }
private static void printlnListTopic(List<Topic> listTopic){
	for (Topic topic : listTopic) {
		String s="topic: "+topic.getId()+" \t name: "+topic.getName()+"\t description: "+topic.getDescription();
		System.out.println(s);
	}
}
}
