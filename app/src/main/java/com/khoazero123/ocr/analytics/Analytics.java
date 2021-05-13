package com.khoazero123.ocr.analytics;

import com.khoazero123.ocr.cropimage.image_processing.BlurDetectionResult;
import com.khoazero123.ocr.documents.creation.ocr.LayoutQuestionDialog;
import com.khoazero123.ocr.main_menu.language.OcrLanguage;

public interface Analytics {
    boolean getAppOptOut();

    void toggleTracking(boolean optOut);

    void sendScreenView(String screenName);

    void sendStartDownload(OcrLanguage language);

    void sendDeleteLanguage(OcrLanguage language);

    void sendOcrResult(String language, int accuracy);

    void sendOcrLanguageChanged(OcrLanguage language);

    void sendLayoutDialogCancelled();

    void sendOcrCancelled();

    void sendOcrStarted(String language, LayoutQuestionDialog.LayoutKind layout);

    void optionDocumentViewMode(boolean showingText);

    void optionTextSettings();

    void optionTableOfContents();

    void optionsDeleteDocument();

    void optionsCreatePdf();

    void optionsCopyToClipboard();

    void optionsShareText();

    void ttsStart(String language);

    void startGallery();

    void startCamera();

    void sendCropError();

    void sendBlurResult(BlurDetectionResult blurriness);

    void newImageBecauseOfBlurWarning(float blurriness);

    void continueDespiteOfBlurWarning(float blurriness);

    void ocrResultSendFeedback();

    void ocrResultCopyToClipboard();

    void ocrResultShowTips();

    void ocrResultCreatePdf();

    void ocrResultShareText();

    void sendClickYoutube();

    void sendIgnoreMemoryWarning(long availableMegs);

    void sendHeedMemoryWarning(long availableMegs);

    void optionTranslateText();

    void noLanguageInstalled();


}
