package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.r0;
import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a implements r0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67472c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67473d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67475b;

    public a(int i10, String str) {
        this.f67474a = i10;
        this.f67475b = str;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f67474a + ",url=" + this.f67475b + ")";
    }
}
