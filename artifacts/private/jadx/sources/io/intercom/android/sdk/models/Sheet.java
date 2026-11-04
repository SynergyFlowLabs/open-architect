package io.intercom.android.sdk.models;

import com.google.gson.o;

/* JADX INFO: loaded from: classes13.dex */
public class Sheet {
    private final String body;

    public static final class Builder {
        o sheet_request_body;
        String sheet_title;

        public Sheet build() {
            return new Sheet(this);
        }
    }

    Sheet(Builder builder) {
        o oVar = builder.sheet_request_body;
        this.body = oVar == null ? "" : oVar.toString();
    }

    public String getBody() {
        return this.body;
    }
}
