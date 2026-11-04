package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes5.dex */
public class t extends com.google.firebase.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f124787a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f124794a;

        static {
            int i10 = 5 << 2;
        }

        a(int i10) {
            this.f124794a = i10;
        }

        public int l() {
            return this.f124794a;
        }
    }

    public t(@NonNull String str) {
        super(str);
        this.f124787a = a.UNKNOWN;
    }

    @NonNull
    public a a() {
        return this.f124787a;
    }

    public t(@NonNull String str, @p0 Throwable th2) {
        super(str, th2);
        this.f124787a = a.UNKNOWN;
    }

    public t(@NonNull String str, @NonNull a aVar) {
        super(str);
        this.f124787a = aVar;
    }

    public t(@NonNull String str, @p0 Throwable th2, @NonNull a aVar) {
        super(str, th2);
        this.f124787a = aVar;
    }
}
