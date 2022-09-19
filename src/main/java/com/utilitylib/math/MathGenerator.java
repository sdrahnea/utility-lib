package com.utilitylib.math;

import com.utilitylib.model.TextDTO;
import com.utilitylib.utils.PDPageContentStreamUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.util.Random;

@Slf4j
public class MathGenerator {

    private static final String DEFAULT_PATH = "src/main/resources/pdf/num_lt_50_sum/";
    private static final String LEFT_ZEROS = "%03d";

    public static void main(String... args) {
        for(int index = 1; index < 100; index++) {
            generate(computeFileName(index));
        }
    }

    private static String computeFileName(final int index){
        final String fileIndex = String.format(LEFT_ZEROS, index);
        return DEFAULT_PATH + "page_of_number_" + fileIndex + ".pdf";
    }

    public static void generateOnePositionNumbers() {
        for (int index = 0; index < 300; index++) {
            Random rand = new Random();
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);
            System.out.println(x + " + " + y + " = ");
        }
    }

    public static void generateTwoPositionNumbers() {
        for (int index = 0; index < 300; index++) {
            Random rand = new Random();
            int x = rand.nextInt(20);
            int y = rand.nextInt(20);
            System.out.println(x + " + " + y + " = ");
        }
    }

    public static String generateTwoPositionNumbers(final int numberLimit) {
        Random rand = new Random();
        int x = rand.nextInt(numberLimit);
        int y = rand.nextInt(numberLimit);
        return x + " + " + y + " = ";
    }

    public static void generate(final String fileName) {
        try {
            PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            document.addPage(page);

            PDFont font = PDType1Font.HELVETICA_BOLD;

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            float ty = 700;
            for (int index = 0; index < 25; index++) {

                TextDTO textDTO1 = new TextDTO(generateTwoPositionNumbers(50), 100, ty, 12);
                TextDTO textDTO2 = new TextDTO(generateTwoPositionNumbers(50), 225, ty, 12);
                TextDTO textDTO3 = new TextDTO(generateTwoPositionNumbers(50), 350, ty, 12);
                TextDTO textDTO4 = new TextDTO(generateTwoPositionNumbers(50), 475, ty, 12);
                textDTO1.setTy(ty);
                textDTO2.setTy(ty);
                textDTO3.setTy(ty);
                textDTO4.setTy(ty);
                PDPageContentStreamUtils.drawText(contentStream, font, textDTO1);
                PDPageContentStreamUtils.drawText(contentStream, font, textDTO2);
                PDPageContentStreamUtils.drawText(contentStream, font, textDTO3);
                PDPageContentStreamUtils.drawText(contentStream, font, textDTO4);
                ty -= 30;
            }
            contentStream.close();

            document.save(fileName);
            document.close();
        } catch (Exception exception) {
            log.error("Received an exception during the execution: " + exception);
        }
    }

}
