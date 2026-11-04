package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.b4;
import androidx.media3.common.c4;
import androidx.media3.common.e4;
import androidx.media3.common.i4;
import androidx.media3.common.z3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class o extends FrameLayout {

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final int f70015h4 = 5000;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final int f70016i4 = 0;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final int f70017j4 = 200;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final int f70018k4 = 100;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final int f70019l4 = 1000;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final float[] f70020m4;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f70021n4 = 0;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final int f70022o4 = 1;
    private final String A3;
    private final Drawable B3;
    private final Drawable C3;
    private final float D3;
    private final float E3;
    private final String F3;
    private final String G3;

    @androidx.annotation.p0
    private final ImageView H1;
    private final Drawable H3;
    private final Drawable I3;
    private final String J3;
    private final String K3;
    private final Drawable L3;
    private final Drawable M3;
    private final String N3;
    private final String O3;

    @androidx.annotation.p0
    private androidx.media3.common.z0 P3;

    @androidx.annotation.p0
    private f Q3;

    @androidx.annotation.p0
    private d R3;
    private boolean S3;
    private boolean T3;
    private boolean U3;
    private boolean V3;
    private boolean W3;
    private boolean X3;
    private int Y3;
    private int Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f70023a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private int f70024a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f70025b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private long[] f70026b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f70027c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private boolean[] f70028c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f70029d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private long[] f70030d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RecyclerView f70031e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private boolean[] f70032e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f70033f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private long f70034f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f70035g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70036g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private boolean f70037g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f70038h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70039h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f70040i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f70041i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e1 f70042j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f70043j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PopupWindow f70044k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f70045k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f70046l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f70047l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70048m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f70049m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70050n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @androidx.annotation.p0
    private final d1 f70051n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70052o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final StringBuilder f70053o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70054p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70055p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @androidx.annotation.p0
    private final ImageView f70056p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final Formatter f70057p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final z3.b f70058q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private final z3.d f70059r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f70060s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final Runnable f70061s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    private final View f70062t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private final Drawable f70063t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private final Drawable f70064u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f70065v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Drawable f70066v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private final TextView f70067w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final Drawable f70068w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final Drawable f70069x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private final String f70070y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final String f70071z3;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void o(b bVar, View view) {
            if (o.this.P3 != null && o.this.P3.P0(29)) {
                ((androidx.media3.common.z0) androidx.media3.common.util.k1.o(o.this.P3)).n1(o.this.P3.V0().I().J(1).w0(1, false).G());
                o.this.f70033f.k(1, o.this.getResources().getString(v0.k.I));
                o.this.f70044k.dismiss();
            }
        }

        private boolean p(e4 e4Var) {
            for (int i10 = 0; i10 < this.f70092a.size(); i10++) {
                if (e4Var.D.containsKey(this.f70092a.get(i10).f70089a.c())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.o.l
        public void j(List<k> list) {
            this.f70092a = list;
            e4 e4VarV0 = ((androidx.media3.common.z0) androidx.media3.common.util.a.g(o.this.P3)).V0();
            if (list.isEmpty()) {
                o.this.f70033f.k(1, o.this.getResources().getString(v0.k.J));
                return;
            }
            if (!p(e4VarV0)) {
                o.this.f70033f.k(1, o.this.getResources().getString(v0.k.I));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = list.get(i10);
                if (kVar.a()) {
                    o.this.f70033f.k(1, kVar.f70091c);
                    return;
                }
            }
        }

        @Override // androidx.media3.ui.o.l
        public void l(i iVar) {
            int i10;
            iVar.f70086a.setText(v0.k.I);
            boolean zP = p(((androidx.media3.common.z0) androidx.media3.common.util.a.g(o.this.P3)).V0());
            View view = iVar.f70087b;
            if (zP) {
                i10 = 4;
                int i11 = 1 & 4;
            } else {
                i10 = 0;
            }
            view.setVisibility(i10);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o.b.o(this.f70094a, view2);
                }
            });
        }

        @Override // androidx.media3.ui.o.l
        public void n(String str) {
            o.this.f70033f.k(1, str);
        }
    }

    private final class c implements androidx.media3.common.z0.g, d1.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // androidx.media3.ui.d1.a
        public void L(d1 d1Var, long j10) {
            if (o.this.f70049m3 != null) {
                o.this.f70049m3.setText(androidx.media3.common.util.k1.J0(o.this.f70053o3, o.this.f70057p3, j10));
            }
        }

        @Override // androidx.media3.ui.d1.a
        public void P(d1 d1Var, long j10, boolean z10) {
            o.this.X3 = false;
            if (!z10 && o.this.P3 != null) {
                o oVar = o.this;
                oVar.m0(oVar.P3, j10);
            }
            o.this.f70023a.T();
        }

        @Override // androidx.media3.common.z0.g
        public void S(androidx.media3.common.z0 z0Var, androidx.media3.common.z0.f fVar) {
            if (fVar.b(4, 5, 13)) {
                o.this.w0();
            }
            if (fVar.b(4, 5, 7, 13)) {
                o.this.y0();
            }
            if (fVar.b(8, 13)) {
                o.this.z0();
            }
            if (fVar.b(9, 13)) {
                o.this.D0();
            }
            if (fVar.b(8, 9, 11, 0, 16, 17, 13)) {
                o.this.v0();
            }
            if (fVar.b(11, 0, 13)) {
                o.this.E0();
            }
            if (fVar.b(12, 13)) {
                o.this.x0();
            }
            if (fVar.b(2, 13)) {
                o.this.F0();
            }
        }

        @Override // androidx.media3.ui.d1.a
        public void l(d1 d1Var, long j10) {
            o.this.X3 = true;
            if (o.this.f70049m3 != null) {
                o.this.f70049m3.setText(androidx.media3.common.util.k1.J0(o.this.f70053o3, o.this.f70057p3, j10));
            }
            o.this.f70023a.S();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.media3.common.z0 z0Var = o.this.P3;
            if (z0Var == null) {
                return;
            }
            o.this.f70023a.T();
            if (o.this.f70050n == view) {
                if (z0Var.P0(9)) {
                    z0Var.X1();
                    return;
                }
                return;
            }
            if (o.this.f70048m == view) {
                if (z0Var.P0(7)) {
                    z0Var.I1();
                    return;
                }
                return;
            }
            if (o.this.f70060s == view) {
                if (z0Var.H() == 4 || !z0Var.P0(12)) {
                    return;
                }
                z0Var.t1();
                return;
            }
            if (o.this.f70062t == view) {
                if (z0Var.P0(11)) {
                    z0Var.t2();
                    return;
                }
                return;
            }
            if (o.this.f70052o == view) {
                androidx.media3.common.util.k1.V0(z0Var, o.this.V3);
                return;
            }
            if (o.this.f70054p0 == view) {
                if (z0Var.P0(15)) {
                    z0Var.D(androidx.media3.common.util.p0.a(z0Var.C(), o.this.f70024a4));
                    return;
                }
                return;
            }
            if (o.this.f70055p1 == view) {
                if (z0Var.P0(14)) {
                    z0Var.K(!z0Var.s0());
                    return;
                }
                return;
            }
            if (o.this.f70041i3 == view) {
                o.this.f70023a.S();
                o oVar = o.this;
                oVar.V(oVar.f70033f, o.this.f70041i3);
                return;
            }
            if (o.this.f70043j3 == view) {
                o.this.f70023a.S();
                o oVar2 = o.this;
                oVar2.V(oVar2.f70035g, o.this.f70043j3);
            } else if (o.this.f70045k3 == view) {
                o.this.f70023a.S();
                o oVar3 = o.this;
                oVar3.V(oVar3.f70040i, o.this.f70045k3);
            } else if (o.this.f70056p2 == view) {
                o.this.f70023a.S();
                o oVar4 = o.this;
                oVar4.V(oVar4.f70038h, o.this.f70056p2);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (o.this.f70037g4) {
                o.this.f70023a.T();
            }
        }
    }

    @Deprecated
    public interface d {
        void L(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f70074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f70075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f70076c;

        public e(String[] strArr, float[] fArr) {
            this.f70074a = strArr;
            this.f70075b = fArr;
        }

        public static /* synthetic */ void h(e eVar, int i10, View view) {
            if (i10 != eVar.f70076c) {
                o.this.setPlaybackSpeed(eVar.f70075b[i10]);
            }
            o.this.f70044k.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f70074a.length;
        }

        public String i() {
            return this.f70074a[this.f70076c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f70074a;
            if (i10 < strArr.length) {
                iVar.f70086a.setText(strArr[i10]);
            }
            if (i10 == this.f70076c) {
                iVar.itemView.setSelected(true);
                iVar.f70087b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f70087b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.e.h(this.f70095a, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(o.this.getContext()).inflate(v0.i.f70354j, viewGroup, false));
        }

        public void l(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f70075b;
                if (i10 >= fArr.length) {
                    this.f70076c = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }
    }

    public interface f {
        void a(long j10, long j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f70078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f70079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImageView f70080c;

        public g(View view) {
            super(view);
            if (androidx.media3.common.util.k1.f61540a < 26) {
                view.setFocusable(true);
            }
            this.f70078a = (TextView) view.findViewById(v0.g.f70307o0);
            this.f70079b = (TextView) view.findViewById(v0.g.K0);
            this.f70080c = (ImageView) view.findViewById(v0.g.f70301m0);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o.g gVar = this.f70097a;
                    o.this.j0(gVar.getBindingAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.h<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f70082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f70083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Drawable[] f70084c;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f70082a = strArr;
            this.f70083b = new String[strArr.length];
            this.f70084c = drawableArr;
        }

        private boolean l(int i10) {
            if (o.this.P3 == null) {
                return false;
            }
            if (i10 == 0) {
                return o.this.P3.P0(13);
            }
            if (i10 != 1) {
                return true;
            }
            return o.this.P3.P0(30) && o.this.P3.P0(29);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f70082a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i10) {
            return i10;
        }

        public boolean h() {
            return l(1) || l(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            if (l(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f70078a.setText(this.f70082a[i10]);
            if (this.f70083b[i10] == null) {
                gVar.f70079b.setVisibility(8);
            } else {
                gVar.f70079b.setText(this.f70083b[i10]);
            }
            if (this.f70084c[i10] == null) {
                gVar.f70080c.setVisibility(8);
            } else {
                gVar.f70080c.setImageDrawable(this.f70084c[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return o.this.new g(LayoutInflater.from(o.this.getContext()).inflate(v0.i.f70353i, viewGroup, false));
        }

        public void k(int i10, String str) {
            this.f70083b[i10] = str;
        }
    }

    private static class i extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f70086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f70087b;

        public i(View view) {
            super(view);
            if (androidx.media3.common.util.k1.f61540a < 26) {
                view.setFocusable(true);
            }
            this.f70086a = (TextView) view.findViewById(v0.g.N0);
            this.f70087b = view.findViewById(v0.g.f70265a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void o(j jVar, View view) {
            if (o.this.P3 != null && o.this.P3.P0(29)) {
                boolean z10 = false | false;
                o.this.P3.n1(o.this.P3.V0().I().J(3).U(-3).k0(null).o0(0).G());
                o.this.f70044k.dismiss();
            }
        }

        @Override // androidx.media3.ui.o.l
        public void j(List<k> list) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).a()) {
                    z10 = true;
                    break;
                }
            }
            if (o.this.f70056p2 != null) {
                ImageView imageView = o.this.f70056p2;
                o oVar = o.this;
                imageView.setImageDrawable(z10 ? oVar.H3 : oVar.I3);
                o.this.f70056p2.setContentDescription(z10 ? o.this.J3 : o.this.K3);
            }
            this.f70092a = list;
        }

        @Override // androidx.media3.ui.o.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f70087b.setVisibility(this.f70092a.get(i10 + (-1)).a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.o.l
        public void l(i iVar) {
            boolean z10;
            iVar.f70086a.setText(v0.k.J);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f70092a.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f70092a.get(i11).a()) {
                        z10 = false;
                        break;
                    }
                    i11++;
                }
            }
            View view = iVar.f70087b;
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o.j.o(this.f70098a, view2);
                }
            });
        }

        @Override // androidx.media3.ui.o.l
        public void n(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i4.a f70089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70091c;

        public k(i4 i4Var, int i10, int i11, String str) {
            this.f70089a = i4Var.c().get(i10);
            this.f70090b = i11;
            this.f70091c = str;
        }

        public boolean a() {
            return this.f70089a.k(this.f70090b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class l extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List<k> f70092a = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void h(l lVar, androidx.media3.common.z0 z0Var, b4 b4Var, k kVar, View view) {
            lVar.getClass();
            if (z0Var.P0(29)) {
                z0Var.n1(z0Var.V0().I().e0(new c4(b4Var, l6.G(Integer.valueOf(kVar.f70090b)))).w0(kVar.f70089a.f(), false).G());
                lVar.n(kVar.f70091c);
                o.this.f70044k.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f70092a.isEmpty()) {
                return 0;
            }
            return this.f70092a.size() + 1;
        }

        protected void i() {
            this.f70092a = Collections.EMPTY_LIST;
        }

        public abstract void j(List<k> list);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: k */
        public void onBindViewHolder(i iVar, int i10) {
            final androidx.media3.common.z0 z0Var = o.this.P3;
            if (z0Var == null) {
                return;
            }
            if (i10 == 0) {
                l(iVar);
                return;
            }
            boolean z10 = true;
            final k kVar = this.f70092a.get(i10 - 1);
            final b4 b4VarC = kVar.f70089a.c();
            int i11 = 0;
            if (z0Var.V0().D.get(b4VarC) == null || !kVar.a()) {
                z10 = false;
            }
            iVar.f70086a.setText(kVar.f70091c);
            View view = iVar.f70087b;
            if (!z10) {
                i11 = 4;
            }
            view.setVisibility(i11);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    o.l.h(this.f70099a, z0Var, b4VarC, kVar, view2);
                }
            });
        }

        protected abstract void l(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            boolean z10 = false;
            return new i(LayoutInflater.from(o.this.getContext()).inflate(v0.i.f70354j, viewGroup, false));
        }

        protected abstract void n(String str);
    }

    @Deprecated
    public interface m {
        void l(int i10);
    }

    static {
        androidx.media3.common.p0.a("media3.ui");
        f70020m4 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public o(Context context) {
        this(context, null);
    }

    private void A0() {
        androidx.media3.common.z0 z0Var = this.P3;
        int iV2 = (int) ((z0Var != null ? z0Var.v2() : 5000L) / 1000);
        TextView textView = this.f70067w;
        if (textView != null) {
            textView.setText(String.valueOf(iV2));
        }
        View view = this.f70062t;
        if (view != null) {
            view.setContentDescription(this.f70025b.getQuantityString(v0.j.f70363b, iV2, Integer.valueOf(iV2)));
        }
    }

    private void B0() {
        q0(this.f70033f.h(), this.f70041i3);
    }

    private void C0() {
        this.f70031e.measure(0, 0);
        this.f70044k.setWidth(Math.min(this.f70031e.getMeasuredWidth(), getWidth() - (this.f70046l * 2)));
        this.f70044k.setHeight(Math.min(getHeight() - (this.f70046l * 2), this.f70031e.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        ImageView imageView;
        if (f0() && this.T3 && (imageView = this.f70055p1) != null) {
            androidx.media3.common.z0 z0Var = this.P3;
            if (!this.f70023a.A(imageView)) {
                q0(false, this.f70055p1);
                return;
            }
            if (z0Var != null && z0Var.P0(14)) {
                q0(true, this.f70055p1);
                this.f70055p1.setImageDrawable(z0Var.s0() ? this.B3 : this.C3);
                this.f70055p1.setContentDescription(z0Var.s0() ? this.F3 : this.G3);
                return;
            }
            q0(false, this.f70055p1);
            this.f70055p1.setImageDrawable(this.C3);
            this.f70055p1.setContentDescription(this.G3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void E0() {
        int i10;
        long jD1;
        z3.d dVar;
        long j10;
        androidx.media3.common.z0 z0Var = this.P3;
        if (z0Var == null) {
            return;
        }
        boolean z10 = true;
        this.W3 = this.U3 && T(z0Var, this.f70059r3);
        long j11 = 0;
        this.f70034f4 = 0L;
        z3 z3VarC0 = z0Var.P0(17) ? z0Var.c0() : z3.f61958a;
        long j12 = -9223372036854775807L;
        if (!z3VarC0.w()) {
            int iL0 = z0Var.l0();
            boolean z11 = this.W3;
            int i11 = z11 ? 0 : iL0;
            int iV = z11 ? z3VarC0.v() - 1 : iL0;
            i10 = 0;
            long j13 = 0;
            while (i11 <= iV) {
                if (i11 == iL0) {
                    this.f70034f4 = androidx.media3.common.util.k1.A2(j13);
                }
                z3VarC0.t(i11, this.f70059r3);
                z3.d dVar2 = this.f70059r3;
                boolean z12 = z10;
                long j14 = j11;
                if (dVar2.f62000m == j12) {
                    androidx.media3.common.util.a.i(this.W3 ^ z12);
                    break;
                }
                int i12 = dVar2.f62001n;
                while (true) {
                    dVar = this.f70059r3;
                    if (i12 <= dVar.f62002o) {
                        z3VarC0.j(i12, this.f70058q3);
                        int iR = this.f70058q3.r();
                        int iD = this.f70058q3.d();
                        while (iR < iD) {
                            long jG = this.f70058q3.g(iR);
                            if (jG == Long.MIN_VALUE) {
                                j10 = j12;
                                long j15 = this.f70058q3.f61970d;
                                if (j15 != j10) {
                                    jG = j15;
                                }
                                iR++;
                                j12 = j10;
                            } else {
                                j10 = j12;
                            }
                            long jQ = jG + this.f70058q3.q();
                            if (jQ >= j14) {
                                long[] jArr = this.f70026b4;
                                if (i10 == jArr.length) {
                                    ?? length = jArr.length == 0 ? z12 : jArr.length * 2;
                                    this.f70026b4 = Arrays.copyOf(jArr, (int) length);
                                    this.f70028c4 = Arrays.copyOf(this.f70028c4, (int) length);
                                }
                                this.f70026b4[i10] = androidx.media3.common.util.k1.A2(j13 + jQ);
                                this.f70028c4[i10] = this.f70058q3.s(iR);
                                i10++;
                            }
                            iR++;
                            j12 = j10;
                        }
                        i12++;
                    }
                }
                j13 += dVar.f62000m;
                i11++;
                z10 = z12;
                j11 = j14;
            }
            jD1 = j13;
        } else if (z0Var.P0(16)) {
            long jN = z0Var.N();
            if (jN != -9223372036854775807L) {
                jD1 = androidx.media3.common.util.k1.D1(jN);
                i10 = 0;
            } else {
                i10 = 0;
                jD1 = 0;
            }
        } else {
            i10 = 0;
            jD1 = 0;
        }
        long jA2 = androidx.media3.common.util.k1.A2(jD1);
        TextView textView = this.f70047l3;
        if (textView != null) {
            textView.setText(androidx.media3.common.util.k1.J0(this.f70053o3, this.f70057p3, jA2));
        }
        d1 d1Var = this.f70051n3;
        if (d1Var != null) {
            d1Var.setDuration(jA2);
            int length2 = this.f70030d4.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.f70026b4;
            if (i13 > jArr2.length) {
                this.f70026b4 = Arrays.copyOf(jArr2, i13);
                this.f70028c4 = Arrays.copyOf(this.f70028c4, i13);
            }
            System.arraycopy(this.f70030d4, 0, this.f70026b4, i10, length2);
            System.arraycopy(this.f70032e4, 0, this.f70028c4, i10, length2);
            this.f70051n3.b(this.f70026b4, this.f70028c4, i13);
        }
        y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        a0();
        q0(this.f70038h.getItemCount() > 0, this.f70056p2);
        B0();
    }

    private static boolean T(androidx.media3.common.z0 z0Var, z3.d dVar) {
        z3 z3VarC0;
        int iV;
        if (z0Var.P0(17) && (iV = (z3VarC0 = z0Var.c0()).v()) > 1 && iV <= 100) {
            for (int i10 = 0; i10 < iV; i10++) {
                if (z3VarC0.t(i10, dVar).f62000m == -9223372036854775807L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(RecyclerView.h<?> hVar, View view) {
        this.f70031e.setAdapter(hVar);
        C0();
        this.f70037g4 = false;
        this.f70044k.dismiss();
        this.f70037g4 = true;
        this.f70044k.showAsDropDown(view, (getWidth() - this.f70044k.getWidth()) - this.f70046l, (-this.f70044k.getHeight()) - this.f70046l);
    }

    private l6<k> W(i4 i4Var, int i10) {
        l6.a aVar = new l6.a();
        l6<i4.a> l6VarC = i4Var.c();
        for (int i11 = 0; i11 < l6VarC.size(); i11++) {
            i4.a aVar2 = l6VarC.get(i11);
            if (aVar2.f() == i10) {
                for (int i12 = 0; i12 < aVar2.f60646a; i12++) {
                    if (aVar2.l(i12)) {
                        androidx.media3.common.w wVarD = aVar2.d(i12);
                        if ((wVarD.f61751e & 2) == 0) {
                            aVar.a(new k(i4Var, i11, i12, this.f70042j.a(wVarD)));
                        }
                    }
                }
            }
        }
        return aVar.e();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(v0.m.f70426c1, i10);
    }

    private void a0() {
        this.f70038h.i();
        this.f70040i.i();
        androidx.media3.common.z0 z0Var = this.P3;
        if (z0Var != null && z0Var.P0(30) && this.P3.P0(29)) {
            i4 i4VarM0 = this.P3.M0();
            this.f70040i.j(W(i4VarM0, 1));
            if (this.f70023a.A(this.f70056p2)) {
                this.f70038h.j(W(i4VarM0, 3));
            } else {
                this.f70038h.j(l6.F());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @e.a({"InlinedApi"})
    private static boolean e0(int i10) {
        if (i10 != 90 && i10 != 89 && i10 != 85 && i10 != 79 && i10 != 126 && i10 != 127 && i10 != 87 && i10 != 88) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(View view) {
        u0(!this.S3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f70044k.isShowing()) {
            C0();
            this.f70044k.update(view, (getWidth() - this.f70044k.getWidth()) - this.f70046l, (-this.f70044k.getHeight()) - this.f70046l, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i10) {
        if (i10 == 0) {
            V(this.f70035g, (View) androidx.media3.common.util.a.g(this.f70041i3));
        } else if (i10 == 1) {
            V(this.f70040i, (View) androidx.media3.common.util.a.g(this.f70041i3));
        } else {
            this.f70044k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(androidx.media3.common.z0 z0Var, long j10) {
        if (this.W3) {
            if (z0Var.P0(17) && z0Var.P0(10)) {
                z3 z3VarC0 = z0Var.c0();
                int iV = z3VarC0.v();
                int i10 = 0;
                while (true) {
                    long jE = z3VarC0.t(i10, this.f70059r3).e();
                    if (j10 < jE) {
                        break;
                    }
                    if (i10 == iV - 1) {
                        j10 = jE;
                        break;
                    } else {
                        j10 -= jE;
                        i10++;
                    }
                }
                z0Var.j0(i10, j10);
            }
        } else if (z0Var.P0(5)) {
            z0Var.F(j10);
        }
        y0();
    }

    private void q0(boolean z10, @androidx.annotation.p0 View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.D3 : this.E3);
    }

    private void r0() {
        androidx.media3.common.z0 z0Var = this.P3;
        int iI1 = (int) ((z0Var != null ? z0Var.i1() : 15000L) / 1000);
        TextView textView = this.f70065v;
        if (textView != null) {
            textView.setText(String.valueOf(iI1));
        }
        View view = this.f70060s;
        if (view != null) {
            view.setContentDescription(this.f70025b.getQuantityString(v0.j.f70362a, iI1, Integer.valueOf(iI1)));
        }
    }

    private void s0(@androidx.annotation.p0 ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.L3);
            imageView.setContentDescription(this.N3);
        } else {
            imageView.setImageDrawable(this.M3);
            imageView.setContentDescription(this.O3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        androidx.media3.common.z0 z0Var = this.P3;
        if (z0Var == null || !z0Var.P0(13)) {
            return;
        }
        androidx.media3.common.z0 z0Var2 = this.P3;
        z0Var2.h(z0Var2.c().d(f10));
    }

    private static void t0(@androidx.annotation.p0 View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        boolean zP0;
        boolean zP1;
        boolean zP2;
        boolean zP3;
        boolean zP4;
        if (f0() && this.T3) {
            androidx.media3.common.z0 z0Var = this.P3;
            if (z0Var != null) {
                zP0 = (this.U3 && T(z0Var, this.f70059r3)) ? z0Var.P0(10) : z0Var.P0(5);
                zP2 = z0Var.P0(7);
                zP3 = z0Var.P0(11);
                zP4 = z0Var.P0(12);
                zP1 = z0Var.P0(9);
            } else {
                zP0 = false;
                zP1 = false;
                zP2 = false;
                zP3 = false;
                zP4 = false;
            }
            if (zP3) {
                A0();
            }
            if (zP4) {
                r0();
            }
            q0(zP2, this.f70048m);
            q0(zP3, this.f70062t);
            q0(zP4, this.f70060s);
            q0(zP1, this.f70050n);
            d1 d1Var = this.f70051n3;
            if (d1Var != null) {
                d1Var.setEnabled(zP0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        if (f0() && this.T3 && this.f70052o != null) {
            boolean zI2 = androidx.media3.common.util.k1.i2(this.P3, this.V3);
            Drawable drawable = zI2 ? this.f70063t3 : this.f70064u3;
            int i10 = zI2 ? v0.k.f70375l : v0.k.f70374k;
            this.f70052o.setImageDrawable(drawable);
            this.f70052o.setContentDescription(this.f70025b.getString(i10));
            q0(androidx.media3.common.util.k1.f2(this.P3), this.f70052o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        androidx.media3.common.z0 z0Var = this.P3;
        if (z0Var == null) {
            return;
        }
        this.f70035g.l(z0Var.c().f61874a);
        this.f70033f.k(0, this.f70035g.i());
        B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        long jN0;
        long jR;
        if (f0() && this.T3) {
            androidx.media3.common.z0 z0Var = this.P3;
            if (z0Var == null || !z0Var.P0(16)) {
                jN0 = 0;
                jR = 0;
            } else {
                jN0 = this.f70034f4 + z0Var.n0();
                jR = this.f70034f4 + z0Var.R();
            }
            TextView textView = this.f70049m3;
            if (textView != null && !this.X3) {
                textView.setText(androidx.media3.common.util.k1.J0(this.f70053o3, this.f70057p3, jN0));
            }
            d1 d1Var = this.f70051n3;
            if (d1Var != null) {
                d1Var.setPosition(jN0);
                this.f70051n3.setBufferedPosition(jR);
            }
            f fVar = this.Q3;
            if (fVar != null) {
                fVar.a(jN0, jR);
            }
            removeCallbacks(this.f70061s3);
            int iH = z0Var == null ? 1 : z0Var.H();
            if (z0Var == null || !z0Var.isPlaying()) {
                if (iH == 4 || iH == 1) {
                    return;
                }
                postDelayed(this.f70061s3, 1000L);
                return;
            }
            d1 d1Var2 = this.f70051n3;
            long jMin = Math.min(d1Var2 != null ? d1Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jN0 % 1000));
            float f10 = z0Var.c().f61874a;
            postDelayed(this.f70061s3, androidx.media3.common.util.k1.x(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.Z3, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        ImageView imageView;
        if (f0() && this.T3 && (imageView = this.f70054p0) != null) {
            if (this.f70024a4 == 0) {
                q0(false, imageView);
                return;
            }
            androidx.media3.common.z0 z0Var = this.P3;
            if (z0Var != null && z0Var.P0(15)) {
                q0(true, this.f70054p0);
                int iC = z0Var.C();
                if (iC == 0) {
                    this.f70054p0.setImageDrawable(this.f70066v3);
                    this.f70054p0.setContentDescription(this.f70070y3);
                    return;
                } else {
                    if (iC == 1) {
                        this.f70054p0.setImageDrawable(this.f70068w3);
                        this.f70054p0.setContentDescription(this.f70071z3);
                        return;
                    }
                    int i10 = 0 & 2;
                    if (iC != 2) {
                        return;
                    }
                    this.f70054p0.setImageDrawable(this.f70069x3);
                    this.f70054p0.setContentDescription(this.A3);
                    return;
                }
            }
            q0(false, this.f70054p0);
            this.f70054p0.setImageDrawable(this.f70066v3);
            this.f70054p0.setContentDescription(this.f70070y3);
        }
    }

    @Deprecated
    public void S(m mVar) {
        androidx.media3.common.util.a.g(mVar);
        this.f70029d.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.media3.common.z0 z0Var = this.P3;
        if (z0Var == null || !e0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (z0Var.H() == 4 || !z0Var.P0(12)) {
                return true;
            }
            z0Var.t1();
            return true;
        }
        if (keyCode == 89 && z0Var.P0(11)) {
            z0Var.t2();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            androidx.media3.common.util.k1.V0(z0Var, this.V3);
            return true;
        }
        if (keyCode == 87) {
            if (!z0Var.P0(9)) {
                return true;
            }
            z0Var.X1();
            return true;
        }
        if (keyCode == 88) {
            if (!z0Var.P0(7)) {
                return true;
            }
            z0Var.I1();
            return true;
        }
        if (keyCode == 126) {
            androidx.media3.common.util.k1.T0(z0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        androidx.media3.common.util.k1.S0(z0Var);
        return true;
    }

    public void Y() {
        this.f70023a.C();
    }

    public void Z() {
        this.f70023a.F();
    }

    public boolean c0() {
        return this.f70023a.I();
    }

    public boolean d0() {
        return this.f70023a.J();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean f0() {
        return getVisibility() == 0;
    }

    void g0() {
        Iterator<m> it = this.f70029d.iterator();
        while (it.hasNext()) {
            it.next().l(getVisibility());
        }
    }

    @androidx.annotation.p0
    public androidx.media3.common.z0 getPlayer() {
        return this.P3;
    }

    public int getRepeatToggleModes() {
        return this.f70024a4;
    }

    public boolean getShowShuffleButton() {
        return this.f70023a.A(this.f70055p1);
    }

    public boolean getShowSubtitleButton() {
        return this.f70023a.A(this.f70056p2);
    }

    public int getShowTimeoutMs() {
        return this.Y3;
    }

    public boolean getShowVrButton() {
        return this.f70023a.A(this.H1);
    }

    @Deprecated
    public void k0(m mVar) {
        this.f70029d.remove(mVar);
    }

    void l0() {
        ImageView imageView = this.f70052o;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void n0(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr) {
        if (jArr == null) {
            this.f70030d4 = new long[0];
            this.f70032e4 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) androidx.media3.common.util.a.g(zArr);
            androidx.media3.common.util.a.a(jArr.length == zArr2.length);
            this.f70030d4 = jArr;
            this.f70032e4 = zArr2;
        }
        E0();
    }

    public void o0() {
        this.f70023a.Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70023a.L();
        this.T3 = true;
        if (d0()) {
            this.f70023a.T();
        }
        p0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f70023a.M();
        this.T3 = false;
        removeCallbacks(this.f70061s3);
        this.f70023a.S();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f70023a.N(z10, i10, i11, i12, i13);
    }

    void p0() {
        w0();
        v0();
        z0();
        D0();
        F0();
        x0();
        E0();
    }

    public void setAnimationEnabled(boolean z10) {
        this.f70023a.U(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@androidx.annotation.p0 d dVar) {
        this.R3 = dVar;
        t0(this.f70036g3, dVar != null);
        t0(this.f70039h3, dVar != null);
    }

    public void setPlayer(@androidx.annotation.p0 androidx.media3.common.z0 z0Var) {
        androidx.media3.common.util.a.i(Looper.myLooper() == Looper.getMainLooper());
        androidx.media3.common.util.a.a(z0Var == null || z0Var.d0() == Looper.getMainLooper());
        androidx.media3.common.z0 z0Var2 = this.P3;
        if (z0Var2 == z0Var) {
            return;
        }
        if (z0Var2 != null) {
            z0Var2.Q1(this.f70027c);
        }
        this.P3 = z0Var;
        if (z0Var != null) {
            z0Var.U1(this.f70027c);
        }
        p0();
    }

    public void setProgressUpdateListener(@androidx.annotation.p0 f fVar) {
        this.Q3 = fVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.f70024a4 = i10;
        androidx.media3.common.z0 z0Var = this.P3;
        if (z0Var != null && z0Var.P0(15)) {
            int iC = this.P3.C();
            if (i10 == 0 && iC != 0) {
                this.P3.D(0);
            } else if (i10 == 1 && iC == 2) {
                this.P3.D(1);
            } else if (i10 == 2 && iC == 1) {
                this.P3.D(2);
            }
        }
        this.f70023a.V(this.f70054p0, i10 != 0);
        z0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f70023a.V(this.f70060s, z10);
        v0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.U3 = z10;
        E0();
    }

    public void setShowNextButton(boolean z10) {
        this.f70023a.V(this.f70050n, z10);
        v0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.V3 = z10;
        w0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f70023a.V(this.f70048m, z10);
        v0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f70023a.V(this.f70062t, z10);
        v0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f70023a.V(this.f70055p1, z10);
        D0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f70023a.V(this.f70056p2, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.Y3 = i10;
        if (d0()) {
            this.f70023a.T();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f70023a.V(this.H1, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.Z3 = androidx.media3.common.util.k1.w(i10, 16, 1000);
    }

    public void setVrButtonListener(@androidx.annotation.p0 View.OnClickListener onClickListener) {
        ImageView imageView = this.H1;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            q0(onClickListener != null, this.H1);
        }
    }

    public void u0(boolean z10) {
        if (this.S3 != z10) {
            this.S3 = z10;
            s0(this.f70036g3, z10);
            s0(this.f70039h3, z10);
            d dVar = this.R3;
            if (dVar != null) {
                dVar.L(z10);
            }
        }
    }

    public o(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public o(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10, @androidx.annotation.p0 AttributeSet attributeSet2) {
        final o oVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z16;
        boolean z17;
        int i24;
        TextView textView;
        Context context2;
        c cVar;
        final o oVar2;
        boolean z18;
        super(context, attributeSet, i10);
        int i25 = v0.i.f70350f;
        int resourceId = v0.e.f70240o0;
        int i26 = v0.e.f70238n0;
        int resourceId2 = v0.e.f70232k0;
        int i27 = v0.e.f70258x0;
        int i28 = v0.e.f70242p0;
        int i29 = v0.e.f70260y0;
        int i30 = v0.e.f70230j0;
        int resourceId3 = v0.e.f70228i0;
        int i31 = v0.e.f70246r0;
        int resourceId4 = v0.e.f70248s0;
        int i32 = v0.e.f70244q0;
        int i33 = v0.e.f70256w0;
        int i34 = v0.e.f70254v0;
        int i35 = v0.e.B0;
        int i36 = v0.e.A0;
        int i37 = v0.e.C0;
        this.V3 = true;
        this.Y3 = 5000;
        this.f70024a4 = 0;
        this.Z3 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, v0.m.I0, i10, 0);
            try {
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(v0.m.P0, i25);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(v0.m.V0, resourceId);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(v0.m.U0, i26);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(v0.m.T0, resourceId2);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(v0.m.Q0, i27);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(v0.m.Y0, i28);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70430d1, i29);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(v0.m.S0, i30);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(v0.m.R0, resourceId3);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70418a1, i31);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70422b1, resourceId4);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(v0.m.Z0, i32);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70490s1, i33);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70486r1, i34);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70498u1, i35);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70494t1, i36);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(v0.m.f70514y1, i37);
                oVar = this;
                oVar.Y3 = typedArrayObtainStyledAttributes.getInt(v0.m.f70478p1, oVar.Y3);
                oVar.f70024a4 = X(typedArrayObtainStyledAttributes, oVar.f70024a4);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70466m1, true);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70454j1, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70462l1, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70458k1, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70470n1, false);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70474o1, false);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(v0.m.f70482q1, false);
                oVar.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(v0.m.f70502v1, oVar.Z3));
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(v0.m.L0, true);
                typedArrayObtainStyledAttributes.recycle();
                i15 = resourceId5;
                i16 = resourceId13;
                z15 = z26;
                i20 = resourceId8;
                i13 = resourceId10;
                i14 = resourceId12;
                i17 = resourceId14;
                i12 = resourceId15;
                i18 = resourceId16;
                i11 = resourceId17;
                z10 = z19;
                z16 = z20;
                z11 = z22;
                z12 = z23;
                z13 = z24;
                z14 = z25;
                i19 = resourceId7;
                i21 = resourceId9;
                i22 = resourceId11;
                i23 = resourceId6;
                z17 = z21;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            oVar = this;
            i11 = i37;
            i12 = i35;
            i13 = i30;
            i14 = i32;
            i15 = i25;
            i16 = i33;
            i17 = i34;
            i18 = i36;
            z10 = true;
            z11 = true;
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = true;
            i19 = i27;
            i20 = i28;
            i21 = i29;
            i22 = i31;
            i23 = i26;
            z16 = true;
            z17 = true;
        }
        int i38 = resourceId4;
        int i39 = resourceId2;
        int i40 = resourceId3;
        int i41 = resourceId;
        LayoutInflater.from(context).inflate(i15, oVar);
        oVar.setDescendantFocusability(262144);
        c cVar2 = new c();
        oVar.f70027c = cVar2;
        oVar.f70029d = new CopyOnWriteArrayList<>();
        oVar.f70058q3 = new z3.b();
        oVar.f70059r3 = new z3.d();
        StringBuilder sb2 = new StringBuilder();
        oVar.f70053o3 = sb2;
        oVar.f70057p3 = new Formatter(sb2, Locale.getDefault());
        oVar.f70026b4 = new long[0];
        oVar.f70028c4 = new boolean[0];
        oVar.f70030d4 = new long[0];
        oVar.f70032e4 = new boolean[0];
        oVar.f70061s3 = new Runnable() { // from class: androidx.media3.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f70009a.y0();
            }
        };
        oVar.f70047l3 = (TextView) oVar.findViewById(v0.g.f70280f0);
        oVar.f70049m3 = (TextView) oVar.findViewById(v0.g.f70340z0);
        ImageView imageView = (ImageView) oVar.findViewById(v0.g.L0);
        oVar.f70056p2 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) oVar.findViewById(v0.g.f70298l0);
        oVar.f70036g3 = imageView2;
        b0(imageView2, new View.OnClickListener() { // from class: androidx.media3.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70012a.h0(view);
            }
        });
        ImageView imageView3 = (ImageView) oVar.findViewById(v0.g.f70313q0);
        oVar.f70039h3 = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: androidx.media3.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70012a.h0(view);
            }
        });
        View viewFindViewById = oVar.findViewById(v0.g.G0);
        oVar.f70041i3 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar2);
        }
        View viewFindViewById2 = oVar.findViewById(v0.g.f70337y0);
        oVar.f70043j3 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar2);
        }
        View viewFindViewById3 = oVar.findViewById(v0.g.V);
        oVar.f70045k3 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar2);
        }
        d1 d1Var = (d1) oVar.findViewById(v0.g.B0);
        View viewFindViewById4 = oVar.findViewById(v0.g.C0);
        if (d1Var != null) {
            oVar.f70051n3 = d1Var;
            i24 = i22;
            textView = null;
            context2 = context;
            cVar = cVar2;
            oVar2 = oVar;
        } else if (viewFindViewById4 != null) {
            i24 = i22;
            oVar2 = this;
            context2 = context;
            cVar = cVar2;
            textView = null;
            androidx.media3.ui.f fVar = new androidx.media3.ui.f(context2, null, 0, attributeSet2, v0.l.B);
            fVar.setId(v0.g.B0);
            fVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(fVar, iIndexOfChild);
            oVar2.f70051n3 = fVar;
        } else {
            i24 = i22;
            textView = null;
            context2 = context;
            cVar = cVar2;
            oVar2 = oVar;
            oVar2.f70051n3 = null;
        }
        d1 d1Var2 = oVar2.f70051n3;
        if (d1Var2 != null) {
            d1Var2.c(cVar);
        }
        Resources resources = context2.getResources();
        oVar2.f70025b = resources;
        ImageView imageView4 = (ImageView) oVar2.findViewById(v0.g.f70334x0);
        oVar2.f70052o = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) oVar2.findViewById(v0.g.A0);
        oVar2.f70048m = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(androidx.media3.common.util.k1.r0(context2, resources, i20));
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) oVar2.findViewById(v0.g.f70316r0);
        oVar2.f70050n = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(androidx.media3.common.util.k1.r0(context2, resources, i39));
            imageView6.setOnClickListener(cVar);
        }
        Typeface typefaceJ = androidx.core.content.res.i.j(context2, v0.f.f70263a);
        ImageView imageView7 = (ImageView) oVar2.findViewById(v0.g.E0);
        TextView textView2 = (TextView) oVar2.findViewById(v0.g.F0);
        if (imageView7 != null) {
            imageView7.setImageDrawable(androidx.media3.common.util.k1.r0(context2, resources, i21));
            oVar2.f70062t = imageView7;
            oVar2.f70067w = textView;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceJ);
            oVar2.f70067w = textView2;
            oVar2.f70062t = textView2;
        } else {
            oVar2.f70067w = textView;
            oVar2.f70062t = textView;
        }
        View view = oVar2.f70062t;
        if (view != null) {
            view.setOnClickListener(cVar);
        }
        ImageView imageView8 = (ImageView) oVar2.findViewById(v0.g.f70292j0);
        TextView textView3 = (TextView) oVar2.findViewById(v0.g.f70295k0);
        if (imageView8 != null) {
            imageView8.setImageDrawable(androidx.media3.common.util.k1.r0(context2, resources, i19));
            oVar2.f70060s = imageView8;
            oVar2.f70065v = textView;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceJ);
            oVar2.f70065v = textView3;
            oVar2.f70060s = textView3;
        } else {
            oVar2.f70065v = textView;
            oVar2.f70060s = textView;
        }
        View view2 = oVar2.f70060s;
        if (view2 != null) {
            view2.setOnClickListener(cVar);
        }
        ImageView imageView9 = (ImageView) oVar2.findViewById(v0.g.D0);
        oVar2.f70054p0 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(cVar);
        }
        ImageView imageView10 = (ImageView) oVar2.findViewById(v0.g.I0);
        oVar2.f70055p1 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(cVar);
        }
        oVar2.D3 = resources.getInteger(v0.h.f70343b) / 100.0f;
        oVar2.E3 = resources.getInteger(v0.h.f70342a) / 100.0f;
        ImageView imageView11 = (ImageView) oVar2.findViewById(v0.g.Q0);
        oVar2.H1 = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(androidx.media3.common.util.k1.r0(context2, resources, i11));
            oVar2.q0(false, imageView11);
        }
        h0 h0Var = new h0(oVar2);
        oVar2.f70023a = h0Var;
        h0Var.U(z15);
        h hVar = oVar2.new h(new String[]{resources.getString(v0.k.f70376m), resources.getString(v0.k.K)}, new Drawable[]{androidx.media3.common.util.k1.r0(context2, resources, v0.e.f70262z0), androidx.media3.common.util.k1.r0(context2, resources, v0.e.f70222f0)});
        oVar2.f70033f = hVar;
        oVar2.f70046l = resources.getDimensionPixelSize(v0.d.f70208x);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(v0.i.f70352h, (ViewGroup) null);
        oVar2.f70031e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(oVar2.getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        oVar2.f70044k = popupWindow;
        if (androidx.media3.common.util.k1.f61540a < 23) {
            z18 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z18 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        oVar2.f70037g4 = true;
        oVar2.f70042j = new androidx.media3.ui.g(oVar2.getResources());
        oVar2.H3 = androidx.media3.common.util.k1.r0(context2, resources, i12);
        oVar2.I3 = androidx.media3.common.util.k1.r0(context2, resources, i18);
        oVar2.J3 = resources.getString(v0.k.f70365b);
        oVar2.K3 = resources.getString(v0.k.f70364a);
        oVar2.f70038h = new j();
        oVar2.f70040i = new b();
        oVar2.f70035g = oVar2.new e(resources.getStringArray(v0.a.f70108a), f70020m4);
        oVar2.f70063t3 = androidx.media3.common.util.k1.r0(context2, resources, i41);
        oVar2.f70064u3 = androidx.media3.common.util.k1.r0(context2, resources, i23);
        oVar2.L3 = androidx.media3.common.util.k1.r0(context2, resources, i13);
        oVar2.M3 = androidx.media3.common.util.k1.r0(context2, resources, i40);
        oVar2.f70066v3 = androidx.media3.common.util.k1.r0(context2, resources, i24);
        oVar2.f70068w3 = androidx.media3.common.util.k1.r0(context2, resources, i38);
        oVar2.f70069x3 = androidx.media3.common.util.k1.r0(context2, resources, i14);
        oVar2.B3 = androidx.media3.common.util.k1.r0(context2, resources, i16);
        oVar2.C3 = androidx.media3.common.util.k1.r0(context2, resources, i17);
        oVar2.N3 = resources.getString(v0.k.f70369f);
        oVar2.O3 = resources.getString(v0.k.f70368e);
        oVar2.f70070y3 = resources.getString(v0.k.f70379p);
        oVar2.f70071z3 = resources.getString(v0.k.f70380q);
        oVar2.A3 = resources.getString(v0.k.f70378o);
        oVar2.F3 = resources.getString(v0.k.f70386w);
        oVar2.G3 = resources.getString(v0.k.f70385v);
        h0Var.V((ViewGroup) oVar2.findViewById(v0.g.X), true);
        h0Var.V(oVar2.f70060s, z16);
        h0Var.V(oVar2.f70062t, z10);
        h0Var.V(imageView5, z17);
        h0Var.V(imageView6, z11);
        h0Var.V(imageView10, z12);
        h0Var.V(imageView, z13);
        h0Var.V(imageView11, z14);
        h0Var.V(imageView9, oVar2.f70024a4 != 0 ? true : z18);
        oVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.media3.ui.n
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i42, int i43, int i44, int i45, int i46, int i47, int i48, int i49) {
                this.f70013a.i0(view3, i42, i43, i44, i45, i46, i47, i48, i49);
            }
        });
    }
}
