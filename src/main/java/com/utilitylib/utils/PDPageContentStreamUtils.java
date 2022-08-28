package com.utilitylib.utils;

import com.utilitylib.model.TextDTO;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;

import java.io.IOException;

public final class PDPageContentStreamUtils {

    public static void drawText(PDPageContentStream contentStream, PDFont font, TextDTO textDTO) throws IOException {
        contentStream.beginText();
        contentStream.setFont( font, textDTO.getFontSize() );
        contentStream.moveTextPositionByAmount(textDTO.getTx(), textDTO.getTy() );
        contentStream.drawString(textDTO.getText());
        contentStream.endText();
    }

}
