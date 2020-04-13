package edu.berkeley.aep;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// understand the behaviors of directedGraph
public class DirectedGraph {
    private LinkedList<LinkedList<Integer>> graph = new LinkedList<>();

    private void init() {
        File file = new File("graphInit/graphInit.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String st;
            String[] tem;
            while ((st = br.readLine()) != null) {
                if(st.length() == 0) {
                    graph.add(new LinkedList<>());
                    continue;
                }
                tem = st.split(",");
                graph.add(new LinkedList<>(Arrays.stream(tem).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList())));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public DirectedGraph(){
        init();
    }

    public int canReach(int from, int to){
        var hopOption = new HashMap<Integer, Integer>();
        for(int i = 0; i< graph.size(); i++)
            hopOption.put(i, graph.size());
        canReach(from, to, new HashSet<>(), hopOption);
        return hopOption.get(from);
    }
    // return 0 if from == to; return int that larger than 0, means hops; return -1 means not connected
    public void canReach(int from, int to, Set<Integer> visited, HashMap<Integer, Integer> hopOption) {
        if(from == to){
            hopOption.put(from, 0);
        }
        if(from >= graph.size() || to >= graph.size())
            throw new IllegalArgumentException("out of bound");

        if(!visited.add(from)) return;

        for(Integer child: graph.get(from)) {
            canReach(child, to, visited, hopOption);
            if((hopOption.get(child) + 1) < hopOption.get(from)){

                hopOption.put(from, hopOption.get(child) + 1);
            }
        }
    }
}

