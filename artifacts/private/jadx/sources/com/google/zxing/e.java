package com.google.zxing;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public enum e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(u.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f130475a;

    static {
        int i10 = 0 << 5;
    }

    e(Class cls) {
        this.f130475a = cls;
    }

    public Class<?> k() {
        return this.f130475a;
    }
}
