package sergo.matrix;

import sergo.vector.Vector;

import java.util.Arrays;

public class Matrix  {


   private final Vector[] rows;



   public Matrix(int rows, int columns){
      if(rows <= 0 || columns <= 0){
         throw new IllegalArgumentException("Размеры матрицы могут быть лишь положительными");
      }
      this.rows = new Vector[rows];
      Vector vector = new Vector(columns);
      for (int i = 0; i < rows; ++i) {
         this.rows[i] = vector ;
      }
   }

   public Matrix(Matrix ob){
      rows = ob.rows;
   }


   private int columnsCountMax(double[][] array){

      int length = 0;

      for (int i = 0; i < array.length; ++i){
         if(array[i].length > length){
              length = array[i].length;
         }
      }
      return length;
   }

   public Matrix(double[][] array){

      rows = new Vector[array.length];
      for (int i = 0; i < array.length; ++i){

         rows[i] = new Vector(columnsCountMax(array), array[i]);
      }
   }


   private int columnsCountMax(Vector[] array){

      int length = 0;

      for (int i = 0; i < array.length; ++i){
         if(array[i].getSize() > length){
            length = array[i].getSize();
         }
      }
      return length;
   }

   public Matrix(Vector[] rows){
      this.rows = new Vector[rows.length];
      for (int i = 0; i < rows.length; ++i){
         this.rows[i] = new Vector(columnsCountMax(rows),rows[i].getVector());
      }
   }


   // Получение размеров матрицы

   public int getRowsCount(){
      return rows.length;
   }

   public int getColumnsCount(){
      return rows[0].getSize();
   }


   // Получение и задание вектора-строки по индексу

   public Vector getRow(int index){

      if(index < 0 || index >= rows.length){
         throw new ArrayIndexOutOfBoundsException("Неверный индекс");
      }
      return  rows[index];

   }


   public void setRow(int index, Vector vector){

      if(index < 0 || index >= rows.length){
         throw new ArrayIndexOutOfBoundsException("Неверный индекс");
      }else{

         int length = getColumnsCount();
         int vectorLength = vector.getSize();

         if(length >= vectorLength){
            rows[index] = new Vector(length, vector.getVector());

         }else {

            for(int i = 0; i < rows.length; ++i){

               if(i == index){
                  rows[i] = vector;
               }else{
                  rows[i] = new Vector(vectorLength,rows[i].getVector());
               }
            }
         }

      }

   }

  // получение вектора-столбца по индексу

   public Vector getColumn(int index){

      Vector column = new Vector(rows.length);

      for(int i = 0; i < rows.length; ++i){

         column.setComponentV(i,rows[i].getComponentV(index));

      }
      return column;
   }


   // Транспонирование матрицы

   public void transpose(){



   }

}

