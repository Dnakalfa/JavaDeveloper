package br.com.prime.java.io.IOBytes.IOObject;

import java.io.*;

//Crie a classe Gato com os atributos nome, idade e cor:
//Instancie um objeto e serialize
//Desserialize este objeto e mostre no console
public class ExemploIOObject {
   public static void serealizacao() throws IOException {
       Gato gato = new Gato("Simba", 6, "amarelado", true, false);

       File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

       oos.writeObject(gato);

       PrintStream ps = new PrintStream(System.out);
       ps.printf("Arquivo \"%s\" criado com sucesso! Tamanho '%d' bytes." , f.getName(), f.length());

       System.out.printf("\nNome..................: %s\n", Gato.getNome());
       System.out.printf("Ronrona................: %s\n",  Gato.isRonrona());
       System.out.printf("Idade...................: %d\n", Gato.getIdade());
       System.out.printf("Cor.....................: %s\n", Gato.getCor());
       System.out.printf("Castrado................: %s\n", Gato.isCastrado());
       System.out.println(gato);

       oos.close();
       ps.close();


   }

   public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException {
       File f = new File(arquivo);
       ObjectInputStream ois = null;
      try {
          InputStream is = new FileInputStream(f.getName()); //abrir o arquivo
          ois = new ObjectInputStream(is); //iniciar o fluxo de leitura de objeto serealizado
          Gato gato = (Gato) ois.readObject();

          System.out.printf("\nNome..................: %s\n", Gato.getNome());
          System.out.printf("Ronrona................: %s\n",  Gato.isRonrona());
          System.out.printf("Idade...................: %d\n", Gato.getIdade());
          System.out.printf("Cor.....................: %s\n", Gato.getCor());
          System.out.printf("Castrado................: %s\n", Gato.isCastrado());
          System.out.println(gato);

      }catch (FileNotFoundException e) { //captura exigida pelo FileInputStream
          System.out.printf("Arquivo %s não encontrado! Verifique o diretório %s", f.getName(), e.getMessage());
          //e.printStackTrace();

      } catch (ClassNotFoundException e) { //captura exigida pelo método readObject()
          System.out.printf("Não foi possível ler o objeto do arquivo \"%s\".", f.getName());
          //e.printStackTrace();

      } catch (IOException e) { //captura exigida pelo ObjectInputStream
          System.out.printf("Não foi possível abrir o arquivo \"%s\".", f.getName());
          //e.printStackTrace();

      } finally { //esse bloco sempre será executando, independente se teve exception ou não.
          try { //tente
              ois.close(); //fechar o arquivo
          } catch (IOException e) { //captura exigida pelo método close()
              System.out.printf("Erro ao fechar o arquivo \"%s\".",f.getName());
              //e.printStackTrace();
          }
      }

   }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serealizacao();
        desserializacao("C:/Users/umberto alves/Desktop/JavaDeveloper/JavaIO/gato");

    }
}
