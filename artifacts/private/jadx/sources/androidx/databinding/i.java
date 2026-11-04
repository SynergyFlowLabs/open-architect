package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class i<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f49386f = "CallbackRegistry";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<C> f49387a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49388b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f49389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a<C, T, A> f49391e;

    public static abstract class a<C, T, A> {
        public abstract void a(C callback, T sender, int arg, A arg2);
    }

    public i(a<C, T, A> notifier) {
        this.f49391e = notifier;
    }

    private boolean g(int index) {
        int i10;
        if (index < 64) {
            return (this.f49388b & (1 << index)) != 0;
        }
        long[] jArr = this.f49389c;
        if (jArr != null && (i10 = (index / 64) - 1) < jArr.length) {
            return ((1 << (index % 64)) & jArr[i10]) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void i(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f49391e.a(this.f49387a.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    private void j(T sender, int arg, A arg2) {
        i(sender, arg, arg2, 0, Math.min(64, this.f49387a.size()), this.f49388b);
    }

    private void k(T sender, int arg, A arg2) {
        int size = this.f49387a.size();
        long[] jArr = this.f49389c;
        int length = jArr == null ? -1 : jArr.length - 1;
        l(sender, arg, arg2, length);
        i(sender, arg, arg2, (length + 2) * 64, size, 0L);
    }

    private void l(T sender, int arg, A arg2, int remainderIndex) {
        if (remainderIndex < 0) {
            j(sender, arg, arg2);
            return;
        }
        long j10 = this.f49389c[remainderIndex];
        int i10 = (remainderIndex + 1) * 64;
        int iMin = Math.min(this.f49387a.size(), i10 + 64);
        l(sender, arg, arg2, remainderIndex - 1);
        i(sender, arg, arg2, i10, iMin, j10);
    }

    private void o(int startIndex, long removed) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = startIndex + 63; i10 >= startIndex; i10--) {
            if ((removed & j10) != 0) {
                this.f49387a.remove(i10);
            }
            j10 >>>= 1;
        }
    }

    private void p(int index) {
        if (index < 64) {
            this.f49388b = (1 << index) | this.f49388b;
            return;
        }
        int i10 = (index / 64) - 1;
        long[] jArr = this.f49389c;
        if (jArr == null) {
            this.f49389c = new long[this.f49387a.size() / 64];
        } else if (jArr.length <= i10) {
            long[] jArr2 = new long[this.f49387a.size() / 64];
            long[] jArr3 = this.f49389c;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f49389c = jArr2;
        }
        long[] jArr4 = this.f49389c;
        jArr4[i10] = (1 << (index % 64)) | jArr4[i10];
    }

    public synchronized void a(C callback) {
        try {
            if (callback == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f49387a.lastIndexOf(callback);
            if (iLastIndexOf < 0 || g(iLastIndexOf)) {
                this.f49387a.add(callback);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        try {
            if (this.f49390d != 0) {
                if (!this.f49387a.isEmpty()) {
                    int size = this.f49387a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            p(size);
                        }
                    }
                }
            } else {
                this.f49387a.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized i<C, T, A> clone() {
        i<C, T, A> iVar;
        CloneNotSupportedException e10;
        try {
            try {
                iVar = (i) super.clone();
                try {
                    iVar.f49388b = 0L;
                    iVar.f49389c = null;
                    iVar.f49390d = 0;
                    iVar.f49387a = new ArrayList();
                    int size = this.f49387a.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!g(i10)) {
                            iVar.f49387a.add(this.f49387a.get(i10));
                        }
                    }
                } catch (CloneNotSupportedException e11) {
                    e10 = e11;
                    e10.printStackTrace();
                }
            } catch (CloneNotSupportedException e12) {
                iVar = null;
                e10 = e12;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iVar;
    }

    public synchronized ArrayList<C> d() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.f49387a.size());
        int size = this.f49387a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!g(i10)) {
                arrayList.add(this.f49387a.get(i10));
            }
        }
        return arrayList;
    }

    public synchronized void e(List<C> callbacks) {
        callbacks.clear();
        int size = this.f49387a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!g(i10)) {
                callbacks.add(this.f49387a.get(i10));
            }
        }
    }

    public synchronized boolean f() {
        try {
            if (this.f49387a.isEmpty()) {
                return true;
            }
            if (this.f49390d == 0) {
                return false;
            }
            int size = this.f49387a.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!g(i10)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(T sender, int arg, A arg2) {
        try {
            this.f49390d++;
            k(sender, arg, arg2);
            int i10 = this.f49390d - 1;
            this.f49390d = i10;
            if (i10 == 0) {
                long[] jArr = this.f49389c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j10 = this.f49389c[length];
                        if (j10 != 0) {
                            o((length + 1) * 64, j10);
                            this.f49389c[length] = 0;
                        }
                    }
                }
                long j11 = this.f49388b;
                if (j11 != 0) {
                    o(0, j11);
                    this.f49388b = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void n(C callback) {
        try {
            if (this.f49390d == 0) {
                this.f49387a.remove(callback);
            } else {
                int iLastIndexOf = this.f49387a.lastIndexOf(callback);
                if (iLastIndexOf >= 0) {
                    p(iLastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
