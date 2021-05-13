package com.khoazero123.ocr.analytics;

import android.content.Context;

public class AnalyticsFactory {

    public static Analytics createAnalytics(Context context) {
        return new LoggingAnalytics();
    }
}
