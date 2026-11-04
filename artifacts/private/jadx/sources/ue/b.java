package ue;

import android.util.Pair;
import androidx.annotation.p0;
import androidx.annotation.v;

/* JADX INFO: loaded from: classes12.dex */
public class b extends Pair<Integer, String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f381244b = new b(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @v
    private Integer f381245a;

    public b(Integer num, String str) {
        super(num, str);
        this.f381245a = null;
    }

    @v
    @p0
    public Integer a() {
        return this.f381245a;
    }

    public void b(@v @p0 Integer num) {
        this.f381245a = num;
    }
}
