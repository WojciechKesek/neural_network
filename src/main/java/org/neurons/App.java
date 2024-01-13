package org.neurons;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double[] input = {0,1};
        double[] weight = {0.5, 0.5};
        double bias = 0.5;
        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i] * weight[i];
        }

        sum += bias;

        double activation = sum > 0 ? 1 : 0;
        System.out.println(activation);
    }
}
