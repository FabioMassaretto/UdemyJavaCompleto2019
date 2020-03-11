package com.fabio.javacompletoudemy.secao019aula207.application;

import com.fabio.javacompletoudemy.secao019aula207.domain.entity.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        String path = "/Users/fabiomassareto/Documents/candidates.txt";
        Map<Candidate, Integer> candidates = new TreeMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] split = line.split(",");
                String name = split[0];
                Integer votes = Integer.parseInt(split[1].trim());

                Candidate candidate = new Candidate(name, votes);

                boolean candidateExists = candidates.containsKey(candidate);

                if(candidateExists) {
                    Integer getVotes = candidates.get(candidate);
                    Integer sumOfVotes = getVotes + votes;
                    candidates.put(candidate, sumOfVotes);
                } else {
                   candidates.put(candidate, votes);
                }

               line = br.readLine();
            }

            for (Candidate key : candidates.keySet()){
                System.out.println(key.getName() + ": " + candidates.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
