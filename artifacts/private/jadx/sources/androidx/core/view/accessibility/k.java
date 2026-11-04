package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48593b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final Object f48594a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k f48595a;

        a(k kVar) {
            this.f48595a = kVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            j jVarB = this.f48595a.b(i10);
            if (jVarB == null) {
                return null;
            }
            return jVarB.q2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<j> listC = this.f48595a.c(str, i10);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listC.get(i11).q2());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            j jVarD = this.f48595a.d(i10);
            if (jVarD == null) {
                return null;
            }
            return jVarD.q2();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f48595a.f(i10, i11, bundle);
        }
    }

    @w0(26)
    static class b extends a {
        b(k kVar) {
            super(kVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f48595a.a(i10, j.r2(accessibilityNodeInfo), str, bundle);
        }
    }

    public k() {
        this.f48594a = new b(this);
    }

    public void a(int i10, @NonNull j jVar, @NonNull String str, @p0 Bundle bundle) {
    }

    @p0
    public j b(int i10) {
        return null;
    }

    @p0
    public List<j> c(@NonNull String str, int i10) {
        return null;
    }

    @p0
    public j d(int i10) {
        return null;
    }

    @p0
    public Object e() {
        return this.f48594a;
    }

    public boolean f(int i10, int i11, @p0 Bundle bundle) {
        return false;
    }

    public k(@p0 Object obj) {
        this.f48594a = obj;
    }
}
