package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import com.badlogic.gdx.utils.t;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f94722a = true;

    private g() {
    }

    public static void a(int i10, com.badlogic.gdx.graphics.i iVar, int i11, int i12) {
        if (f94722a) {
            d(i10, iVar);
        } else {
            c(i10, iVar, i11, i12);
        }
    }

    public static void b(com.badlogic.gdx.graphics.i iVar, int i10, int i11) {
        a(3553, iVar, i10, i11);
    }

    private static void c(int i10, com.badlogic.gdx.graphics.i iVar, int i11, int i12) {
        GLES20.glTexImage2D(i10, 0, iVar.q(), iVar.v(), iVar.s(), 0, iVar.p(), iVar.r(), iVar.u());
        if (i11 != i12) {
            throw new t("texture width and height must be square when using mipmapping.");
        }
        int iV = iVar.v() / 2;
        int iS = iVar.s() / 2;
        com.badlogic.gdx.graphics.i.a aVarN = com.badlogic.gdx.graphics.i.n();
        com.badlogic.gdx.graphics.i.w(com.badlogic.gdx.graphics.i.a.None);
        com.badlogic.gdx.graphics.i iVar2 = iVar;
        int iV2 = iV;
        int iS2 = iS;
        int i13 = 1;
        while (iV2 > 0 && iS2 > 0) {
            com.badlogic.gdx.graphics.i iVar3 = new com.badlogic.gdx.graphics.i(iV2, iS2, iVar2.o());
            iVar3.h(iVar2, 0, 0, iVar2.v(), iVar2.s(), 0, 0, iV2, iS2);
            if (i13 > 1) {
                iVar2.a();
            }
            int i14 = i13;
            GLES20.glTexImage2D(i10, i14, iVar3.q(), iVar3.v(), iVar3.s(), 0, iVar3.p(), iVar3.r(), iVar3.u());
            iV2 = iVar3.v() / 2;
            iS2 = iVar3.s() / 2;
            i13 = i14 + 1;
            iVar2 = iVar3;
        }
        com.badlogic.gdx.graphics.i.w(aVarN);
    }

    private static void d(int i10, com.badlogic.gdx.graphics.i iVar) {
        GLES20.glTexImage2D(i10, 0, iVar.q(), iVar.v(), iVar.s(), 0, iVar.p(), iVar.r(), iVar.u());
        GLES20.glGenerateMipmap(i10);
    }

    public static void e(boolean z10) {
        f94722a = z10;
    }
}
