package org.apache.commons.lang3.text.translate;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class g extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f337352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f337353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f337354d;

    private g(int i10, int i11, boolean z10) {
        this.f337352b = i10;
        this.f337353c = i11;
        this.f337354d = z10;
    }

    public static g g(int i10) {
        return j(0, i10);
    }

    public static g h(int i10) {
        return j(i10, Integer.MAX_VALUE);
    }

    public static g i(int i10, int i11) {
        return new g(i10, i11, true);
    }

    public static g j(int i10, int i11) {
        return new g(i10, i11, false);
    }

    @Override // org.apache.commons.lang3.text.translate.c
    public boolean f(int i10, Writer writer) throws IOException {
        if (this.f337354d) {
            if (i10 < this.f337352b || i10 > this.f337353c) {
                return false;
            }
        } else if (i10 >= this.f337352b && i10 <= this.f337353c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i10, 10));
        writer.write(59);
        return true;
    }

    public g() {
        this(0, Integer.MAX_VALUE, true);
    }
}
