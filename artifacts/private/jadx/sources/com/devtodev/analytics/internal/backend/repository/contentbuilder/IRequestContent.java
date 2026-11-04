package com.devtodev.analytics.internal.backend.repository.contentbuilder;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IRequestContent {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final String HEADER_CONTENT_TYPE_KEY = "Content-type";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEADER_CONTENT_TYPE_KEY = "Content-type";

        private Companion() {
        }
    }

    @NotNull
    Map<String, String> getBase64Headers();

    @NotNull
    IContentData getContent();

    @NotNull
    Map<String, String> getHeader();

    @NotNull
    String getPrettyJson();

    boolean isEmpty();
}
