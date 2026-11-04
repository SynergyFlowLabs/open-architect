package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.f;
import androidx.constraintlayout.core.parser.g;
import androidx.constraintlayout.core.parser.h;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        int get(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        int get(String str);
    }

    public static void a(String[] strArr) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static u b(String str, b bVar, a aVar) {
        u uVar = new u();
        try {
            f fVarD = g.d(str);
            int size = fVarD.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) fVarD.P(i10);
                String strK = dVar.k();
                androidx.constraintlayout.core.parser.c cVarD0 = dVar.D0();
                int i11 = bVar.get(strK);
                if (i11 == -1) {
                    System.err.println("unknown type " + strK);
                } else {
                    int i12 = aVar.get(i11);
                    if (i12 != 1) {
                        int i13 = 7 << 2;
                        if (i12 == 2) {
                            uVar.b(i11, cVarD0.s());
                            System.out.println("parse " + strK + " INT_MASK > " + cVarD0.s());
                        } else if (i12 == 4) {
                            uVar.a(i11, cVarD0.r());
                            System.out.println("parse " + strK + " FLOAT_MASK > " + cVarD0.r());
                        } else if (i12 == 8) {
                            uVar.c(i11, cVarD0.k());
                            System.out.println("parse " + strK + " STRING_MASK > " + cVarD0.k());
                        }
                    } else {
                        uVar.d(i11, fVarD.j0(i10));
                    }
                }
            }
            return uVar;
        } catch (h e10) {
            System.err.println(e10.toString() + "\n" + Arrays.toString(e10.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            return uVar;
        }
    }

    public static u c(String str) {
        return b(str, new b() { // from class: androidx.constraintlayout.core.motion.parse.a
            @Override // androidx.constraintlayout.core.motion.parse.c.b
            public final int get(String str2) {
                return v.a.a(str2);
            }
        }, new a() { // from class: androidx.constraintlayout.core.motion.parse.b
            @Override // androidx.constraintlayout.core.motion.parse.c.a
            public final int get(int i10) {
                return v.a.getType(i10);
            }
        });
    }
}
