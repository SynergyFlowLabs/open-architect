package com.google.android.filament.utils;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/Float2\n*L\n1#1,155:1\n626#2:156\n624#2:158\n137#3:157\n*S KotlinDebug\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector\n*L\n143#1:156\n143#1:158\n143#1:157\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f104866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Manipulator f104867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private a f104868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private b f104869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList<b> f104870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<b> f104871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList<b> f104872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f104873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f104874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f104875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f104876k;

    private enum a {
        NONE,
        ORBIT,
        PAN,
        ZOOM;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f104882f = kotlin.enums.c.c(k());

        static {
            boolean z10 = false | true;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f104882f;
        }
    }

    @SourceDebugExtension({"SMAP\nGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector$TouchPair\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,155:1\n626#2:156\n624#2:158\n660#2,2:159\n662#2:162\n137#3:157\n42#4:161\n*S KotlinDebug\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector$TouchPair\n*L\n44#1:156\n44#1:158\n45#1:159,2\n45#1:162\n44#1:157\n45#1:161\n*E\n"})
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private e f104883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private e f104884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f104885c;

        public b(@NotNull e pt0, @NotNull e pt1, int i10) {
            Intrinsics.checkNotNullParameter(pt0, "pt0");
            Intrinsics.checkNotNullParameter(pt1, "pt1");
            this.f104883a = pt0;
            this.f104884b = pt1;
            this.f104885c = i10;
        }

        public static /* synthetic */ b e(b bVar, e eVar, e eVar2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                eVar = bVar.f104883a;
            }
            if ((i11 & 2) != 0) {
                eVar2 = bVar.f104884b;
            }
            if ((i11 & 4) != 0) {
                i10 = bVar.f104885c;
            }
            return bVar.d(eVar, eVar2, i10);
        }

        @NotNull
        public final e a() {
            return this.f104883a;
        }

        @NotNull
        public final e b() {
            return this.f104884b;
        }

        public final int c() {
            return this.f104885c;
        }

        @NotNull
        public final b d(@NotNull e pt0, @NotNull e pt1, int i10) {
            Intrinsics.checkNotNullParameter(pt0, "pt0");
            Intrinsics.checkNotNullParameter(pt1, "pt1");
            return new b(pt0, pt1, i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (Intrinsics.areEqual(this.f104883a, bVar.f104883a) && Intrinsics.areEqual(this.f104884b, bVar.f104884b) && this.f104885c == bVar.f104885c) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f104885c;
        }

        @NotNull
        public final e g() {
            e eVar = this.f104883a;
            e eVar2 = this.f104884b;
            return new e((eVar.z() * 0.5f) + (eVar2.z() * 0.5f), (eVar.B() * 0.5f) + (eVar2.B() * 0.5f));
        }

        @NotNull
        public final e h() {
            return this.f104883a;
        }

        public int hashCode() {
            return (((this.f104883a.hashCode() * 31) + this.f104884b.hashCode()) * 31) + Integer.hashCode(this.f104885c);
        }

        @NotNull
        public final e i() {
            return this.f104884b;
        }

        public final float j() {
            e eVar = this.f104883a;
            e eVar2 = this.f104884b;
            e eVar3 = new e(eVar.z() - eVar2.z(), eVar.B() - eVar2.B());
            return (float) Math.sqrt((eVar3.z() * eVar3.z()) + (eVar3.B() * eVar3.B()));
        }

        public final int k() {
            return (int) g().z();
        }

        public final int l() {
            return (int) g().B();
        }

        public final void m(int i10) {
            this.f104885c = i10;
        }

        public final void n(@NotNull e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            this.f104883a = eVar;
        }

        public final void o(@NotNull e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            this.f104884b = eVar;
        }

        @NotNull
        public String toString() {
            return "TouchPair(pt0=" + this.f104883a + ", pt1=" + this.f104884b + ", count=" + this.f104885c + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b() {
            this(new e(0.0f), new e(0.0f), 0);
            int i10 = 2 & 0;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull MotionEvent me2, int i10) {
            this();
            Intrinsics.checkNotNullParameter(me2, "me");
            if (me2.getPointerCount() >= 1) {
                e eVar = new e(me2.getX(0), i10 - me2.getY(0));
                this.f104883a = eVar;
                this.f104884b = eVar;
                this.f104885c++;
            }
            if (me2.getPointerCount() >= 2) {
                this.f104884b = new e(me2.getX(1), i10 - me2.getY(1));
                this.f104885c++;
            }
        }
    }

    public h(@NotNull View view, @NotNull Manipulator manipulator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(manipulator, "manipulator");
        this.f104866a = view;
        this.f104867b = manipulator;
        this.f104868c = a.NONE;
        this.f104869d = new b();
        this.f104870e = new ArrayList<>();
        this.f104871f = new ArrayList<>();
        this.f104872g = new ArrayList<>();
        this.f104873h = 2;
        this.f104874i = 4;
        this.f104875j = 10;
        this.f104876k = 0.1f;
    }

    private final void a() {
        this.f104870e.clear();
        this.f104871f.clear();
        this.f104872g.clear();
        this.f104868c = a.NONE;
        this.f104867b.C();
    }

    private final boolean b() {
        return this.f104871f.size() > this.f104873h;
    }

    private final boolean c() {
        if (this.f104870e.size() <= this.f104873h) {
            return false;
        }
        e eVarG = ((b) CollectionsKt.first((List) this.f104870e)).g();
        e eVarG2 = ((b) CollectionsKt.last((List) this.f104870e)).g();
        e eVar = new e(eVarG.z() - eVarG2.z(), eVarG.B() - eVarG2.B());
        return ((float) Math.sqrt((double) ((eVar.z() * eVar.z()) + (eVar.B() * eVar.B())))) > ((float) this.f104874i);
    }

    private final boolean d() {
        if (this.f104872g.size() <= this.f104873h) {
            return false;
        }
        return Math.abs(((b) CollectionsKt.last((List) this.f104872g)).j() - ((b) CollectionsKt.first((List) this.f104872g)).j()) > ((float) this.f104875j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r1 != 3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(@org.jetbrains.annotations.NotNull android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.utils.h.e(android.view.MotionEvent):void");
    }
}
