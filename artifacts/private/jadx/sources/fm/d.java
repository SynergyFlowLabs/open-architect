package fm;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes13.dex */
public class d extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UnsupportedEncodingException f275313a;

    public d(UnsupportedEncodingException unsupportedEncodingException) {
        if (unsupportedEncodingException == null) {
            throw new IllegalArgumentException();
        }
        this.f275313a = unsupportedEncodingException;
    }

    public UnsupportedEncodingException a() {
        return this.f275313a;
    }
}
