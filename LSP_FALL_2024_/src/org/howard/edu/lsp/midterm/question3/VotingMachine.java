package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidates;

    public VotingMachine() {
        candidates = new HashMap<>();
    }

    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);
        } else {
            System.out.println("Candidate \"" + name + "\" already exists.");
        }
    }

    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate \"" + name + "\" does not exist.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            sb.append("Candidate: ").append(entry.getKey()).append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}