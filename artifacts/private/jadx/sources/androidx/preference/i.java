package androidx.preference;

import androidx.annotation.p0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public boolean a(String str, boolean z10) {
        return z10;
    }

    public float b(String str, float f10) {
        return f10;
    }

    public int c(String str, int i10) {
        return i10;
    }

    public long d(String str, long j10) {
        return j10;
    }

    @p0
    public String e(String str, @p0 String str2) {
        return str2;
    }

    @p0
    public Set<String> f(String str, @p0 Set<String> set) {
        return set;
    }

    public void g(String str, boolean z10) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void h(String str, float f10) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void i(String str, int i10) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void j(String str, long j10) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void k(String str, @p0 String str2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }

    public void l(String str, @p0 Set<String> set) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
}
