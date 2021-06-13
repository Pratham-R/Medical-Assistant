package Input;

import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Properties;
import java.util.Scanner; // Import the Scanner class to read text files
import exceptions.*;

class ShowOutput {
    Properties prop = new Properties();

    void Diagnosis(String symp) {
        // list of diseases
        String diseases = symp;
        String d1 = new String("heart attack");
        String d2 = new String("pneumonia");
        String d3 = new String("lung cancer");
        String d4 = new String("bladder diseases");
        String d5 = new String("liver diseases");
        String d6 = new String("skin cancer");
        String d7 = new String("headache disorder");
        String d8 = new String("osteoatharitis");
        String d9 = new String("anorexia nervosa");
        String d10 = new String("gallstones");
        CsvWriter c1 = new CsvWriter();
        String[] data = new String[8];

        // logic to print appropriate disease

        if (diseases.equals(d1)) {
            try {  //to read data from file
                File myObj = new File("../Medical-Assistant/txt/diseases/heart attack.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {
                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("D:\\Team57\\configs\\constants\\exception.properties");
            prop.load(input);
            c1.WriteTOCsv(data[3],d1);}
        catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
        catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
        catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
        catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
        catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
        catch(Exception e){e.getMessage();}
        }
        
        if (diseases.equals(d2)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/pneumonia.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d2);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d3)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/lung cancer.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d3);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d4)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/bladder diseases.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d4);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d5)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/liver diseases.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d5);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d6)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/skin cancer.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d6);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d7)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/headache disorder.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d7);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d8)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/osteoatharitis.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d8);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d9)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/anorexia nervosa.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d9);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (diseases.equals(d10)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/diseases/gallstones.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNext()) {
                    for (int i = 0; i < 8; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(data[3],d10);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
    }

    void AddSymptoms(String symp) {
        String symptom = symp;
        String d1 = new String("chest pain");
        String d2 = new String("shortness of breathe");
        String d3 = new String("cough");
        String d4 = new String("vomiting");
        String d5 = new String("fatique");
        String d6 = new String("sweating");
        String d7 = new String("loss of appetite");
        String d8 = new String("unconciousness");
        String d9 = new String("fainting");
        String d10 = new String("headache");
        CsvWriter c1 = new CsvWriter();
        String[] data = new String[4];

        if (symptom.equals(d1)) {
            try {  //to read data from file
                File myObj = new File("../Medical-Assistant/txt/symptom/chest pain.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d1,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d2)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/shortness of breathe.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d2,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d3)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/cough.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d3,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d4)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/vomiting.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d4,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d5)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/fatique.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d5,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d6)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/sweating.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d6,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d7)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/loss of appetite.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d7,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d8)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/unconciousness.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {


                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d8,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d9)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/fainting.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {
                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d9,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
        if (symptom.equals(d10)) {
            try {
                File myObj = new File("../Medical-Assistant/txt/symptom/headache.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    for (int i = 0; i < 4; i++) {
                        data[i] = myReader.nextLine();
                        System.out.println(data[i]);
                    }
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try{ FileInputStream input=new FileInputStream("../Medical-Assistant/configs/constants/exception.properties");
            prop.load(input);
        c1.WriteTOCsv(d10,data[1]);}
         catch(EmptyFileNameException e){ System.out.println(e+prop.getProperty("emptyNameMessage"));}
            catch(MissingExtensionException e){System.out.println(e+prop.getProperty("extensionMessage"));}
            catch(CsvOnlyException e){System.out.println(e+prop.getProperty("notCsvMessage"));}
            catch(SpecialCharacterException e){System.out.println(e+prop.getProperty("specialcharacterMessage"));}
            catch(LongFileNameException e){System.out.println(e+prop.getProperty("longFileNameMessage"));}
            catch(Exception e){e.getMessage();}
        }
    }
}