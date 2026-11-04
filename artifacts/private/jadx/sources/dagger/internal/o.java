package dagger.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    private enum a implements fg.g<Object> {
        INSTANCE;

        @Override // fg.g
        public void injectMembers(Object obj) {
            p.c(obj, "Cannot inject members into a null reference");
        }
    }

    private o() {
    }

    public static <T> fg.g<T> a() {
        return a.INSTANCE;
    }
}
