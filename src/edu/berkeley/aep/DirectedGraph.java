package edu.berkeley.aep;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
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

    public boolean canReach(int from, int to){
        return canReach(from, to, new HashSet<>());
    }

    public boolean canReach(int from, int to, Set<Integer> visited) {
        if(from == to) return true;
        if(from >= graph.size() || to >= graph.size())
            throw new IllegalArgumentException("out of bound");

        // if has visited, return false, else add 'from' to 'visited'.
        if(!visited.add(from)) return false;
        for(Integer child: graph.get(from)) {
            if(canReach(child, to, visited))
                return true;
        }
        return false;
    }
}

