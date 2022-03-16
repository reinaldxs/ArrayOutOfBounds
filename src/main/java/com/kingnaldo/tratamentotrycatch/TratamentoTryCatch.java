/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingnaldo.tratamentotrycatch;

/**
 *
 * @author devsys-b
 */
public class TratamentoTryCatch {

    public static void main(String[] args) {

        int[] mA = {1, 2, 3, 4, 5};

        try {

            for (int i = 0; i <= mA.length; i++) {
                System.out.println(mA[i]);
            }

        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Erro na matriz.\n");
            System.out.println(erro.getMessage());
        }
    }
}
