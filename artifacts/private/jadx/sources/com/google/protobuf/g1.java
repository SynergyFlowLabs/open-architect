package com.google.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class g1 {
    public static final g1 A3;
    public static final g1 B3;
    public static final g1 C3;
    public static final g1 D3;
    public static final g1 E3;
    public static final g1 F3;
    public static final g1 G3;
    public static final g1 H1;
    public static final g1 H3;
    public static final g1 I3;
    public static final g1 J3;
    private static final g1[] K3;
    private static final Type[] L3;
    private static final /* synthetic */ g1[] M3;
    public static final g1 X;
    public static final g1 Y;
    public static final g1 Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g1 f125944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g1 f125945g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final g1 f125946g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g1 f125947h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final g1 f125948h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g1 f125949i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final g1 f125950i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g1 f125951j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final g1 f125952j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g1 f125953k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final g1 f125954k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final g1 f125955l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final g1 f125956l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g1 f125957m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final g1 f125958m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g1 f125959n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final g1 f125960n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g1 f125961o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final g1 f125962o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g1 f125963p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final g1 f125964p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final g1 f125965p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final g1 f125966p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final g1 f125967q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final g1 f125968r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g1 f125969s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final g1 f125970s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g1 f125971t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final g1 f125972t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final g1 f125973u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g1 f125974v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final g1 f125975v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g1 f125976w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final g1 f125977w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final g1 f125978x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final g1 f125979y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final g1 f125980z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1 f125981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f125983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<?> f125984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f125985e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f125986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f125987b;

        static {
            int[] iArr = new int[w1.values().length];
            f125987b = iArr;
            try {
                iArr[w1.f126447k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f125987b[w1.f126449m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f125987b[w1.f126446j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f125986a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f125986a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f125986a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f125993a;

        b(boolean isList) {
            this.f125993a = isList;
        }

        public boolean k() {
            return this.f125993a;
        }
    }

    static {
        b bVar = b.SCALAR;
        w1 w1Var = w1.f126444h;
        g1 g1Var = new g1("DOUBLE", 0, 0, bVar, w1Var);
        f125944f = g1Var;
        w1 w1Var2 = w1.f126443g;
        g1 g1Var2 = new g1("FLOAT", 1, 1, bVar, w1Var2);
        f125945g = g1Var2;
        w1 w1Var3 = w1.f126442f;
        g1 g1Var3 = new g1("INT64", 2, 2, bVar, w1Var3);
        f125947h = g1Var3;
        g1 g1Var4 = new g1("UINT64", 3, 3, bVar, w1Var3);
        f125949i = g1Var4;
        w1 w1Var4 = w1.f126441e;
        g1 g1Var5 = new g1("INT32", 4, 4, bVar, w1Var4);
        f125951j = g1Var5;
        g1 g1Var6 = new g1("FIXED64", 5, 5, bVar, w1Var3);
        f125953k = g1Var6;
        g1 g1Var7 = new g1("FIXED32", 6, 6, bVar, w1Var4);
        f125955l = g1Var7;
        w1 w1Var5 = w1.f126445i;
        g1 g1Var8 = new g1("BOOL", 7, 7, bVar, w1Var5);
        f125957m = g1Var8;
        w1 w1Var6 = w1.f126446j;
        g1 g1Var9 = new g1("STRING", 8, 8, bVar, w1Var6);
        f125959n = g1Var9;
        w1 w1Var7 = w1.f126449m;
        g1 g1Var10 = new g1("MESSAGE", 9, 9, bVar, w1Var7);
        f125961o = g1Var10;
        w1 w1Var8 = w1.f126447k;
        g1 g1Var11 = new g1("BYTES", 10, 10, bVar, w1Var8);
        f125969s = g1Var11;
        g1 g1Var12 = new g1("UINT32", 11, 11, bVar, w1Var4);
        f125971t = g1Var12;
        w1 w1Var9 = w1.f126448l;
        g1 g1Var13 = new g1("ENUM", 12, 12, bVar, w1Var9);
        f125974v = g1Var13;
        g1 g1Var14 = new g1("SFIXED32", 13, 13, bVar, w1Var4);
        f125976w = g1Var14;
        g1 g1Var15 = new g1("SFIXED64", 14, 14, bVar, w1Var3);
        X = g1Var15;
        g1 g1Var16 = new g1("SINT32", 15, 15, bVar, w1Var4);
        Y = g1Var16;
        g1 g1Var17 = new g1("SINT64", 16, 16, bVar, w1Var3);
        Z = g1Var17;
        g1 g1Var18 = new g1("GROUP", 17, 17, bVar, w1Var7);
        f125963p0 = g1Var18;
        b bVar2 = b.VECTOR;
        g1 g1Var19 = new g1("DOUBLE_LIST", 18, 18, bVar2, w1Var);
        f125964p1 = g1Var19;
        g1 g1Var20 = new g1("FLOAT_LIST", 19, 19, bVar2, w1Var2);
        H1 = g1Var20;
        g1 g1Var21 = new g1("INT64_LIST", 20, 20, bVar2, w1Var3);
        f125965p2 = g1Var21;
        g1 g1Var22 = new g1("UINT64_LIST", 21, 21, bVar2, w1Var3);
        f125946g3 = g1Var22;
        g1 g1Var23 = new g1("INT32_LIST", 22, 22, bVar2, w1Var4);
        f125948h3 = g1Var23;
        g1 g1Var24 = new g1("FIXED64_LIST", 23, 23, bVar2, w1Var3);
        f125950i3 = g1Var24;
        g1 g1Var25 = new g1("FIXED32_LIST", 24, 24, bVar2, w1Var4);
        f125952j3 = g1Var25;
        g1 g1Var26 = new g1("BOOL_LIST", 25, 25, bVar2, w1Var5);
        f125954k3 = g1Var26;
        g1 g1Var27 = new g1("STRING_LIST", 26, 26, bVar2, w1Var6);
        f125956l3 = g1Var27;
        g1 g1Var28 = new g1("MESSAGE_LIST", 27, 27, bVar2, w1Var7);
        f125958m3 = g1Var28;
        g1 g1Var29 = new g1("BYTES_LIST", 28, 28, bVar2, w1Var8);
        f125960n3 = g1Var29;
        g1 g1Var30 = new g1("UINT32_LIST", 29, 29, bVar2, w1Var4);
        f125962o3 = g1Var30;
        g1 g1Var31 = new g1("ENUM_LIST", 30, 30, bVar2, w1Var9);
        f125966p3 = g1Var31;
        g1 g1Var32 = new g1("SFIXED32_LIST", 31, 31, bVar2, w1Var4);
        f125967q3 = g1Var32;
        g1 g1Var33 = new g1("SFIXED64_LIST", 32, 32, bVar2, w1Var3);
        f125968r3 = g1Var33;
        g1 g1Var34 = new g1("SINT32_LIST", 33, 33, bVar2, w1Var4);
        f125970s3 = g1Var34;
        g1 g1Var35 = new g1("SINT64_LIST", 34, 34, bVar2, w1Var3);
        f125972t3 = g1Var35;
        b bVar3 = b.PACKED_VECTOR;
        g1 g1Var36 = new g1("DOUBLE_LIST_PACKED", 35, 35, bVar3, w1Var);
        f125973u3 = g1Var36;
        g1 g1Var37 = new g1("FLOAT_LIST_PACKED", 36, 36, bVar3, w1Var2);
        f125975v3 = g1Var37;
        g1 g1Var38 = new g1("INT64_LIST_PACKED", 37, 37, bVar3, w1Var3);
        f125977w3 = g1Var38;
        g1 g1Var39 = new g1("UINT64_LIST_PACKED", 38, 38, bVar3, w1Var3);
        f125978x3 = g1Var39;
        g1 g1Var40 = new g1("INT32_LIST_PACKED", 39, 39, bVar3, w1Var4);
        f125979y3 = g1Var40;
        g1 g1Var41 = new g1("FIXED64_LIST_PACKED", 40, 40, bVar3, w1Var3);
        f125980z3 = g1Var41;
        g1 g1Var42 = new g1("FIXED32_LIST_PACKED", 41, 41, bVar3, w1Var4);
        A3 = g1Var42;
        g1 g1Var43 = new g1("BOOL_LIST_PACKED", 42, 42, bVar3, w1Var5);
        B3 = g1Var43;
        g1 g1Var44 = new g1("UINT32_LIST_PACKED", 43, 43, bVar3, w1Var4);
        C3 = g1Var44;
        g1 g1Var45 = new g1("ENUM_LIST_PACKED", 44, 44, bVar3, w1Var9);
        D3 = g1Var45;
        g1 g1Var46 = new g1("SFIXED32_LIST_PACKED", 45, 45, bVar3, w1Var4);
        E3 = g1Var46;
        g1 g1Var47 = new g1("SFIXED64_LIST_PACKED", 46, 46, bVar3, w1Var3);
        F3 = g1Var47;
        g1 g1Var48 = new g1("SINT32_LIST_PACKED", 47, 47, bVar3, w1Var4);
        G3 = g1Var48;
        g1 g1Var49 = new g1("SINT64_LIST_PACKED", 48, 48, bVar3, w1Var3);
        H3 = g1Var49;
        g1 g1Var50 = new g1("GROUP_LIST", 49, 49, bVar2, w1Var7);
        I3 = g1Var50;
        g1 g1Var51 = new g1("MAP", 50, 50, b.MAP, w1.f126440d);
        J3 = g1Var51;
        M3 = new g1[]{g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7, g1Var8, g1Var9, g1Var10, g1Var11, g1Var12, g1Var13, g1Var14, g1Var15, g1Var16, g1Var17, g1Var18, g1Var19, g1Var20, g1Var21, g1Var22, g1Var23, g1Var24, g1Var25, g1Var26, g1Var27, g1Var28, g1Var29, g1Var30, g1Var31, g1Var32, g1Var33, g1Var34, g1Var35, g1Var36, g1Var37, g1Var38, g1Var39, g1Var40, g1Var41, g1Var42, g1Var43, g1Var44, g1Var45, g1Var46, g1Var47, g1Var48, g1Var49, g1Var50, g1Var51};
        L3 = new Type[0];
        g1[] g1VarArrValues = values();
        K3 = new g1[g1VarArrValues.length];
        for (g1 g1Var52 : g1VarArrValues) {
            K3[g1Var52.f125982b] = g1Var52;
        }
    }

    private g1(String $enum$name, int $enum$ordinal, int id2, b collection, w1 javaType) {
        int i10;
        super($enum$name, $enum$ordinal);
        this.f125982b = id2;
        this.f125983c = collection;
        this.f125981a = javaType;
        int i11 = a.f125986a[collection.ordinal()];
        boolean z10 = true;
        if (i11 == 1 || i11 == 2) {
            this.f125984d = javaType.k();
        } else {
            this.f125984d = null;
        }
        if (collection != b.SCALAR || (i10 = a.f125987b[javaType.ordinal()]) == 1 || i10 == 2 || i10 == 3) {
            z10 = false;
        }
        this.f125985e = z10;
    }

    public static g1 b(int id2) {
        if (id2 >= 0) {
            g1[] g1VarArr = K3;
            if (id2 < g1VarArr.length) {
                return g1VarArr[id2];
            }
        }
        return null;
    }

    private static Type c(Class<?> clazz) {
        for (Type type : clazz.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = clazz.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type l(Class<?> clazz, Type[] realTypes) {
        while (true) {
            int i10 = 0;
            if (clazz == List.class) {
                if (realTypes.length == 1) {
                    return realTypes[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type typeC = c(clazz);
            if (!(typeC instanceof ParameterizedType)) {
                realTypes = L3;
                Class<?>[] interfaces = clazz.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i10 >= length) {
                        clazz = clazz.getSuperclass();
                        break;
                    }
                    Class<?> cls = interfaces[i10];
                    if (List.class.isAssignableFrom(cls)) {
                        clazz = cls;
                        break;
                    }
                    i10++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) typeC;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                    Type type = actualTypeArguments[i11];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = clazz.getTypeParameters();
                        if (realTypes.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= typeParameters.length) {
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            if (type == typeParameters[i12]) {
                                actualTypeArguments[i11] = realTypes[i12];
                                break;
                            }
                            i12++;
                        }
                    }
                }
                clazz = (Class) parameterizedType.getRawType();
                realTypes = actualTypeArguments;
            }
        }
    }

    private boolean t(Field field) {
        Class<?> type = field.getType();
        if (!this.f125981a.n().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = L3;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type typeL = l(type, actualTypeArguments);
        if (typeL instanceof Class) {
            return this.f125984d.isAssignableFrom((Class) typeL);
        }
        return true;
    }

    public static g1 valueOf(String name) {
        return (g1) Enum.valueOf(g1.class, name);
    }

    public static g1[] values() {
        return (g1[]) M3.clone();
    }

    public boolean K() {
        return b.PACKED_VECTOR.equals(this.f125983c);
    }

    public w1 k() {
        return this.f125981a;
    }

    public int n() {
        return this.f125982b;
    }

    public boolean o() {
        return this.f125983c.k();
    }

    public boolean p() {
        return this.f125983c == b.MAP;
    }

    public boolean q() {
        return this.f125985e;
    }

    public boolean r() {
        return this.f125983c == b.SCALAR;
    }

    public boolean s(Field field) {
        return b.VECTOR.equals(this.f125983c) ? t(field) : this.f125981a.n().isAssignableFrom(field.getType());
    }
}
