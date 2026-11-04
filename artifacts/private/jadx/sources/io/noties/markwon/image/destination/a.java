package io.noties.markwon.image.destination;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    private static class b extends a {
        private b() {
        }

        @Override // io.noties.markwon.image.destination.a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }
    }

    @NonNull
    public static a a() {
        return new b();
    }

    @NonNull
    public abstract String b(@NonNull String str);
}
