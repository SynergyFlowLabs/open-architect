package com.planner5d.library.widget.drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import androidx.annotation.v;
import com.planner5d.library.widget.c1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f254267a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<Drawable[]> f254268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f254269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f254270c;

        public Drawable a(Context context) {
            return b(context, 1)[0];
        }

        public Drawable[] b(Context context, int i10) {
            if (this.f254268a.get(i10) == null) {
                Drawable[] drawableArr = new Drawable[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    drawableArr[i11] = h.a(context, this.f254269b);
                }
                this.f254268a.put(i10, drawableArr);
            }
            return this.f254268a.get(i10);
        }

        private a(b bVar, Integer num) {
            this.f254268a = new SparseArray<>();
            this.f254269b = bVar;
            this.f254270c = num;
        }
    }

    public static Drawable a(Context context, b bVar) {
        return j.a.b(context, bVar.f254282a);
    }

    public static a b(String str, b bVar, Integer num) {
        if (!bVar.f254283b) {
            return new a(bVar, num);
        }
        String str2 = bVar.name() + "_" + num + "_" + str;
        Map<String, a> map = f254267a;
        if (!map.containsKey(str2)) {
            map.put(str2, new a(bVar, num));
        }
        return map.get(str2);
    }

    @v
    public static int c(b bVar) {
        return bVar.f254282a;
    }

    public enum b {
        Small(c1.g.Xb),
        Average(c1.g.Ob),
        User(c1.g.f251395ac),
        Favorite(c1.g.Qb),
        LastUsed(c1.g.Tb),
        UsedInProject(c1.g.Zb),
        Gradient(c1.g.Rb, false),
        Shimmer(c1.g.Wb, true),
        Document(c1.g.f251542ka),
        GreyRounded(c1.g.Sb);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @v
        private final int f254282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f254283b;

        static {
            boolean z10 = !true;
        }

        b(int i10, boolean z10) {
            this.f254282a = i10;
            this.f254283b = z10;
        }

        b(int i10) {
            this.f254282a = i10;
            this.f254283b = true;
        }
    }
}
