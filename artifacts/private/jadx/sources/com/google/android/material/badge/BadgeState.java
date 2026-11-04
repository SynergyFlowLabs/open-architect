package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.h1;
import androidx.annotation.l;
import androidx.annotation.n1;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.s0;
import androidx.annotation.t0;
import com.google.android.material.internal.g0;
import com.google.android.material.resources.d;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f111218l = "badge";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final State f111219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final State f111220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f111221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f111222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f111223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f111224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f111225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f111226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f111227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f111228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f111229k;

    BadgeState(Context context, @n1 int i10, @f int i11, @g1 int i12, @p0 State state) {
        State state2 = new State();
        this.f111220b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f111232a = i10;
        }
        TypedArray typedArrayC = c(context, state.f111232a, i11, i12);
        Resources resources = context.getResources();
        this.f111221c = typedArrayC.getDimensionPixelSize(r6.a.o.f361677d4, -1);
        this.f111227i = context.getResources().getDimensionPixelSize(r6.a.f.f360349pa);
        this.f111228j = context.getResources().getDimensionPixelSize(r6.a.f.f360397sa);
        this.f111222d = typedArrayC.getDimensionPixelSize(r6.a.o.f361917n4, -1);
        this.f111223e = typedArrayC.getDimension(r6.a.o.f361869l4, resources.getDimension(r6.a.f.f360499z2));
        this.f111225g = typedArrayC.getDimension(r6.a.o.f361989q4, resources.getDimension(r6.a.f.D2));
        this.f111224f = typedArrayC.getDimension(r6.a.o.f361652c4, resources.getDimension(r6.a.f.f360499z2));
        this.f111226h = typedArrayC.getDimension(r6.a.o.f361893m4, resources.getDimension(r6.a.f.D2));
        boolean z10 = true;
        this.f111229k = typedArrayC.getInt(r6.a.o.f362158x4, 1);
        state2.f111242i = state.f111242i == -2 ? 255 : state.f111242i;
        if (state.f111246k != -2) {
            state2.f111246k = state.f111246k;
        } else if (typedArrayC.hasValue(r6.a.o.f362134w4)) {
            state2.f111246k = typedArrayC.getInt(r6.a.o.f362134w4, 0);
        } else {
            state2.f111246k = -1;
        }
        if (state.f111244j != null) {
            state2.f111244j = state.f111244j;
        } else if (typedArrayC.hasValue(r6.a.o.f361749g4)) {
            state2.f111244j = typedArrayC.getString(r6.a.o.f361749g4);
        }
        state2.f111250o = state.f111250o;
        state2.f111254s = state.f111254s == null ? context.getString(r6.a.m.N0) : state.f111254s;
        state2.f111255t = state.f111255t == 0 ? r6.a.l.f360938a : state.f111255t;
        state2.f111256v = state.f111256v == 0 ? r6.a.m.f360941a1 : state.f111256v;
        if (state.X != null && !state.X.booleanValue()) {
            z10 = false;
        }
        state2.X = Boolean.valueOf(z10);
        state2.f111247l = state.f111247l == -2 ? typedArrayC.getInt(r6.a.o.f362086u4, -2) : state.f111247l;
        state2.f111248m = state.f111248m == -2 ? typedArrayC.getInt(r6.a.o.f362110v4, -2) : state.f111248m;
        state2.f111236e = Integer.valueOf(state.f111236e == null ? typedArrayC.getResourceId(r6.a.o.f361701e4, r6.a.n.f361384q6) : state.f111236e.intValue());
        state2.f111237f = Integer.valueOf(state.f111237f == null ? typedArrayC.getResourceId(r6.a.o.f361725f4, 0) : state.f111237f.intValue());
        state2.f111238g = Integer.valueOf(state.f111238g == null ? typedArrayC.getResourceId(r6.a.o.f361941o4, r6.a.n.f361384q6) : state.f111238g.intValue());
        state2.f111240h = Integer.valueOf(state.f111240h == null ? typedArrayC.getResourceId(r6.a.o.f361965p4, 0) : state.f111240h.intValue());
        state2.f111233b = Integer.valueOf(state.f111233b == null ? J(context, typedArrayC, r6.a.o.f361602a4) : state.f111233b.intValue());
        state2.f111235d = Integer.valueOf(state.f111235d == null ? typedArrayC.getResourceId(r6.a.o.f361773h4, r6.a.n.J8) : state.f111235d.intValue());
        if (state.f111234c != null) {
            state2.f111234c = state.f111234c;
        } else if (typedArrayC.hasValue(r6.a.o.f361797i4)) {
            state2.f111234c = Integer.valueOf(J(context, typedArrayC, r6.a.o.f361797i4));
        } else {
            state2.f111234c = Integer.valueOf(new d(context, state2.f111235d.intValue()).i().getDefaultColor());
        }
        state2.f111257w = Integer.valueOf(state.f111257w == null ? typedArrayC.getInt(r6.a.o.f361627b4, 8388661) : state.f111257w.intValue());
        state2.Y = Integer.valueOf(state.Y == null ? typedArrayC.getDimensionPixelSize(r6.a.o.f361845k4, resources.getDimensionPixelSize(r6.a.f.f360365qa)) : state.Y.intValue());
        state2.Z = Integer.valueOf(state.Z == null ? typedArrayC.getDimensionPixelSize(r6.a.o.f361821j4, resources.getDimensionPixelSize(r6.a.f.F2)) : state.Z.intValue());
        state2.f111251p0 = Integer.valueOf(state.f111251p0 == null ? typedArrayC.getDimensionPixelOffset(r6.a.o.f362013r4, 0) : state.f111251p0.intValue());
        state2.f111252p1 = Integer.valueOf(state.f111252p1 == null ? typedArrayC.getDimensionPixelOffset(r6.a.o.f362182y4, 0) : state.f111252p1.intValue());
        state2.H1 = Integer.valueOf(state.H1 == null ? typedArrayC.getDimensionPixelOffset(r6.a.o.f362038s4, state2.f111251p0.intValue()) : state.H1.intValue());
        state2.f111253p2 = Integer.valueOf(state.f111253p2 == null ? typedArrayC.getDimensionPixelOffset(r6.a.o.f362206z4, state2.f111252p1.intValue()) : state.f111253p2.intValue());
        state2.f111243i3 = Integer.valueOf(state.f111243i3 == null ? typedArrayC.getDimensionPixelOffset(r6.a.o.f362062t4, 0) : state.f111243i3.intValue());
        state2.f111239g3 = Integer.valueOf(state.f111239g3 == null ? 0 : state.f111239g3.intValue());
        state2.f111241h3 = Integer.valueOf(state.f111241h3 == null ? 0 : state.f111241h3.intValue());
        state2.f111245j3 = Boolean.valueOf(state.f111245j3 == null ? typedArrayC.getBoolean(r6.a.o.Z3, false) : state.f111245j3.booleanValue());
        typedArrayC.recycle();
        if (state.f111249n == null) {
            state2.f111249n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            state2.f111249n = state.f111249n;
        }
        this.f111219a = state;
    }

    private static int J(Context context, @NonNull TypedArray typedArray, @h1 int i10) {
        return com.google.android.material.resources.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray c(Context context, @n1 int i10, @f int i11, @g1 int i12) {
        AttributeSet attributeSetK;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetK = com.google.android.material.drawable.a.k(context, i10, "badge");
            styleAttribute = attributeSetK.getStyleAttribute();
        } else {
            attributeSetK = null;
            styleAttribute = 0;
        }
        return g0.k(context, attributeSetK, r6.a.o.Y3, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    State A() {
        return this.f111219a;
    }

    String B() {
        return this.f111220b.f111244j;
    }

    @g1
    int C() {
        return this.f111220b.f111235d.intValue();
    }

    @r(unit = 1)
    int D() {
        return this.f111220b.f111253p2.intValue();
    }

    @r(unit = 1)
    int E() {
        return this.f111220b.f111252p1.intValue();
    }

    boolean F() {
        return this.f111220b.f111246k != -1;
    }

    boolean G() {
        return this.f111220b.f111244j != null;
    }

    boolean H() {
        return this.f111220b.f111245j3.booleanValue();
    }

    boolean I() {
        return this.f111220b.X.booleanValue();
    }

    void K(@r(unit = 1) int i10) {
        this.f111219a.f111239g3 = Integer.valueOf(i10);
        this.f111220b.f111239g3 = Integer.valueOf(i10);
    }

    void L(@r(unit = 1) int i10) {
        this.f111219a.f111241h3 = Integer.valueOf(i10);
        this.f111220b.f111241h3 = Integer.valueOf(i10);
    }

    void M(int i10) {
        this.f111219a.f111242i = i10;
        this.f111220b.f111242i = i10;
    }

    void N(boolean z10) {
        this.f111219a.f111245j3 = Boolean.valueOf(z10);
        this.f111220b.f111245j3 = Boolean.valueOf(z10);
    }

    void O(@l int i10) {
        this.f111219a.f111233b = Integer.valueOf(i10);
        this.f111220b.f111233b = Integer.valueOf(i10);
    }

    void P(int i10) {
        this.f111219a.f111257w = Integer.valueOf(i10);
        this.f111220b.f111257w = Integer.valueOf(i10);
    }

    void Q(@t0 int i10) {
        this.f111219a.Y = Integer.valueOf(i10);
        this.f111220b.Y = Integer.valueOf(i10);
    }

    void R(int i10) {
        this.f111219a.f111237f = Integer.valueOf(i10);
        this.f111220b.f111237f = Integer.valueOf(i10);
    }

    void S(int i10) {
        this.f111219a.f111236e = Integer.valueOf(i10);
        this.f111220b.f111236e = Integer.valueOf(i10);
    }

    void T(@l int i10) {
        this.f111219a.f111234c = Integer.valueOf(i10);
        this.f111220b.f111234c = Integer.valueOf(i10);
    }

    void U(@t0 int i10) {
        this.f111219a.Z = Integer.valueOf(i10);
        this.f111220b.Z = Integer.valueOf(i10);
    }

    void V(int i10) {
        this.f111219a.f111240h = Integer.valueOf(i10);
        this.f111220b.f111240h = Integer.valueOf(i10);
    }

    void W(int i10) {
        this.f111219a.f111238g = Integer.valueOf(i10);
        this.f111220b.f111238g = Integer.valueOf(i10);
    }

    void X(@f1 int i10) {
        this.f111219a.f111256v = i10;
        this.f111220b.f111256v = i10;
    }

    void Y(CharSequence charSequence) {
        this.f111219a.f111250o = charSequence;
        this.f111220b.f111250o = charSequence;
    }

    void Z(CharSequence charSequence) {
        this.f111219a.f111254s = charSequence;
        this.f111220b.f111254s = charSequence;
    }

    void a() {
        g0(-1);
    }

    void a0(@s0 int i10) {
        this.f111219a.f111255t = i10;
        this.f111220b.f111255t = i10;
    }

    void b() {
        i0(null);
    }

    void b0(@r(unit = 1) int i10) {
        this.f111219a.H1 = Integer.valueOf(i10);
        this.f111220b.H1 = Integer.valueOf(i10);
    }

    void c0(@r(unit = 1) int i10) {
        this.f111219a.f111251p0 = Integer.valueOf(i10);
        this.f111220b.f111251p0 = Integer.valueOf(i10);
    }

    @r(unit = 1)
    int d() {
        return this.f111220b.f111239g3.intValue();
    }

    void d0(@r(unit = 1) int i10) {
        this.f111219a.f111243i3 = Integer.valueOf(i10);
        this.f111220b.f111243i3 = Integer.valueOf(i10);
    }

    @r(unit = 1)
    int e() {
        return this.f111220b.f111241h3.intValue();
    }

    void e0(int i10) {
        this.f111219a.f111247l = i10;
        this.f111220b.f111247l = i10;
    }

    int f() {
        return this.f111220b.f111242i;
    }

    void f0(int i10) {
        this.f111219a.f111248m = i10;
        this.f111220b.f111248m = i10;
    }

    @l
    int g() {
        return this.f111220b.f111233b.intValue();
    }

    void g0(int i10) {
        this.f111219a.f111246k = i10;
        this.f111220b.f111246k = i10;
    }

    int h() {
        return this.f111220b.f111257w.intValue();
    }

    void h0(Locale locale) {
        this.f111219a.f111249n = locale;
        this.f111220b.f111249n = locale;
    }

    @t0
    int i() {
        return this.f111220b.Y.intValue();
    }

    void i0(String str) {
        this.f111219a.f111244j = str;
        this.f111220b.f111244j = str;
    }

    int j() {
        return this.f111220b.f111237f.intValue();
    }

    void j0(@g1 int i10) {
        this.f111219a.f111235d = Integer.valueOf(i10);
        this.f111220b.f111235d = Integer.valueOf(i10);
    }

    int k() {
        return this.f111220b.f111236e.intValue();
    }

    void k0(@r(unit = 1) int i10) {
        this.f111219a.f111253p2 = Integer.valueOf(i10);
        this.f111220b.f111253p2 = Integer.valueOf(i10);
    }

    @l
    int l() {
        return this.f111220b.f111234c.intValue();
    }

    void l0(@r(unit = 1) int i10) {
        this.f111219a.f111252p1 = Integer.valueOf(i10);
        this.f111220b.f111252p1 = Integer.valueOf(i10);
    }

    @t0
    int m() {
        return this.f111220b.Z.intValue();
    }

    void m0(boolean z10) {
        this.f111219a.X = Boolean.valueOf(z10);
        this.f111220b.X = Boolean.valueOf(z10);
    }

    int n() {
        return this.f111220b.f111240h.intValue();
    }

    int o() {
        return this.f111220b.f111238g.intValue();
    }

    @f1
    int p() {
        return this.f111220b.f111256v;
    }

    CharSequence q() {
        return this.f111220b.f111250o;
    }

    CharSequence r() {
        return this.f111220b.f111254s;
    }

    @s0
    int s() {
        return this.f111220b.f111255t;
    }

    @r(unit = 1)
    int t() {
        return this.f111220b.H1.intValue();
    }

    @r(unit = 1)
    int u() {
        return this.f111220b.f111251p0.intValue();
    }

    @r(unit = 1)
    int v() {
        return this.f111220b.f111243i3.intValue();
    }

    int w() {
        return this.f111220b.f111247l;
    }

    int x() {
        return this.f111220b.f111248m;
    }

    int y() {
        return this.f111220b.f111246k;
    }

    Locale z() {
        return this.f111220b.f111249n;
    }

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private static final int f111230k3 = -1;

        /* JADX INFO: renamed from: l3, reason: collision with root package name */
        private static final int f111231l3 = -2;

        @r(unit = 1)
        private Integer H1;
        private Boolean X;

        @t0
        private Integer Y;

        @t0
        private Integer Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @n1
        private int f111232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l
        private Integer f111233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        private Integer f111234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @g1
        private Integer f111235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @g1
        private Integer f111236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @g1
        private Integer f111237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @g1
        private Integer f111238g;

        /* JADX INFO: renamed from: g3, reason: collision with root package name */
        @r(unit = 1)
        private Integer f111239g3;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @g1
        private Integer f111240h;

        /* JADX INFO: renamed from: h3, reason: collision with root package name */
        @r(unit = 1)
        private Integer f111241h3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f111242i;

        /* JADX INFO: renamed from: i3, reason: collision with root package name */
        @r(unit = 1)
        private Integer f111243i3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        private String f111244j;

        /* JADX INFO: renamed from: j3, reason: collision with root package name */
        private Boolean f111245j3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f111246k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f111247l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f111248m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Locale f111249n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @p0
        private CharSequence f111250o;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @r(unit = 1)
        private Integer f111251p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        @r(unit = 1)
        private Integer f111252p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        @r(unit = 1)
        private Integer f111253p2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @p0
        private CharSequence f111254s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @s0
        private int f111255t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @f1
        private int f111256v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f111257w;

        class a implements Parcelable.Creator<State> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(@NonNull Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f111242i = 255;
            this.f111246k = -2;
            this.f111247l = -2;
            this.f111248m = -2;
            this.X = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.f111232a);
            parcel.writeSerializable(this.f111233b);
            parcel.writeSerializable(this.f111234c);
            parcel.writeSerializable(this.f111235d);
            parcel.writeSerializable(this.f111236e);
            parcel.writeSerializable(this.f111237f);
            parcel.writeSerializable(this.f111238g);
            parcel.writeSerializable(this.f111240h);
            parcel.writeInt(this.f111242i);
            parcel.writeString(this.f111244j);
            parcel.writeInt(this.f111246k);
            parcel.writeInt(this.f111247l);
            parcel.writeInt(this.f111248m);
            CharSequence charSequence = this.f111250o;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f111254s;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f111255t);
            parcel.writeSerializable(this.f111257w);
            parcel.writeSerializable(this.Y);
            parcel.writeSerializable(this.Z);
            parcel.writeSerializable(this.f111251p0);
            parcel.writeSerializable(this.f111252p1);
            parcel.writeSerializable(this.H1);
            parcel.writeSerializable(this.f111253p2);
            parcel.writeSerializable(this.f111243i3);
            parcel.writeSerializable(this.f111239g3);
            parcel.writeSerializable(this.f111241h3);
            parcel.writeSerializable(this.X);
            parcel.writeSerializable(this.f111249n);
            parcel.writeSerializable(this.f111245j3);
        }

        State(@NonNull Parcel parcel) {
            this.f111242i = 255;
            this.f111246k = -2;
            this.f111247l = -2;
            this.f111248m = -2;
            this.X = Boolean.TRUE;
            this.f111232a = parcel.readInt();
            this.f111233b = (Integer) parcel.readSerializable();
            this.f111234c = (Integer) parcel.readSerializable();
            this.f111235d = (Integer) parcel.readSerializable();
            this.f111236e = (Integer) parcel.readSerializable();
            this.f111237f = (Integer) parcel.readSerializable();
            this.f111238g = (Integer) parcel.readSerializable();
            this.f111240h = (Integer) parcel.readSerializable();
            this.f111242i = parcel.readInt();
            this.f111244j = parcel.readString();
            this.f111246k = parcel.readInt();
            this.f111247l = parcel.readInt();
            this.f111248m = parcel.readInt();
            this.f111250o = parcel.readString();
            this.f111254s = parcel.readString();
            this.f111255t = parcel.readInt();
            this.f111257w = (Integer) parcel.readSerializable();
            this.Y = (Integer) parcel.readSerializable();
            this.Z = (Integer) parcel.readSerializable();
            this.f111251p0 = (Integer) parcel.readSerializable();
            this.f111252p1 = (Integer) parcel.readSerializable();
            this.H1 = (Integer) parcel.readSerializable();
            this.f111253p2 = (Integer) parcel.readSerializable();
            this.f111243i3 = (Integer) parcel.readSerializable();
            this.f111239g3 = (Integer) parcel.readSerializable();
            this.f111241h3 = (Integer) parcel.readSerializable();
            this.X = (Boolean) parcel.readSerializable();
            this.f111249n = (Locale) parcel.readSerializable();
            this.f111245j3 = (Boolean) parcel.readSerializable();
        }
    }
}
