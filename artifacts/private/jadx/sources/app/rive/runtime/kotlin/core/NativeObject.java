package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNativeObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeObject.kt\napp/rive/runtime/kotlin/core/NativeObject\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,154:1\n37#2,2:155\n1863#3,2:157\n*S KotlinDebug\n*F\n+ 1 NativeObject.kt\napp/rive/runtime/kotlin/core/NativeObject\n*L\n51#1:155,2\n147#1:157,2\n*E\n"})
public abstract class NativeObject implements RefCount {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long NULL_POINTER = 0;

    @NotNull
    private final List<RefCount> dependencies;

    @Nullable
    private Sequence<StackTraceElement> disposeStackTrace;

    @NotNull
    private AtomicInteger refs;
    private long unsafeCppPointer;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NativeObject(long j10) {
        this.unsafeCppPointer = j10;
        this.refs = new AtomicInteger(this.unsafeCppPointer == 0 ? 0 : 1);
        this.dependencies = new ArrayList();
    }

    private final List<StackTraceElement> buildCombinedStackTrace() {
        ArrayList arrayList = new ArrayList();
        Sequence<StackTraceElement> sequence = this.disposeStackTrace;
        if (sequence != null) {
            arrayList.add(new StackTraceElement("--- Stack Trace for NativeObject Dispose ---", "", null, -1));
            CollectionsKt.addAll(arrayList, sequence);
            arrayList.add(new StackTraceElement("--- Current Stack Trace ---", "", null, -1));
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        CollectionsKt.addAll(arrayList, o.k0(o.l0(ArraysKt.asSequence(stackTrace), new Function1() { // from class: app.rive.runtime.kotlin.core.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NativeObject.buildCombinedStackTrace$lambda$1((StackTraceElement) obj));
            }
        }), 1));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildCombinedStackTrace$lambda$1(StackTraceElement stackTraceElement) {
        return !Intrinsics.areEqual(stackTraceElement.getClassName(), NativeObject.class.getName());
    }

    private final synchronized void dispose() throws IllegalArgumentException {
        try {
            if (this.refs.get() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            this.disposeStackTrace = o.l0(ArraysKt.asSequence(stackTrace), new Function1() { // from class: app.rive.runtime.kotlin.core.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(NativeObject.dispose$lambda$2((StackTraceElement) obj));
                }
            });
            List<RefCount> list = this.dependencies;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RefCount) it.next()).release();
            }
            list.clear();
            cppDelete(this.unsafeCppPointer);
            this.unsafeCppPointer = 0L;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dispose$lambda$2(StackTraceElement stackTraceElement) {
        return !Intrinsics.areEqual(stackTraceElement.getClassName(), NativeObject.class.getName());
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int acquire() throws IllegalArgumentException {
        int iAcquire;
        try {
            iAcquire = RefCount.DefaultImpls.acquire(this);
            if (iAcquire <= 1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return iAcquire;
    }

    public void cppDelete(long j10) {
    }

    public final long getCppPointer() throws RiveException {
        if (getHasCppObject()) {
            return this.unsafeCppPointer;
        }
        RiveException riveException = new RiveException("Accessing disposed C++ object " + getClass().getSimpleName() + '.');
        riveException.setStackTrace((StackTraceElement[]) buildCombinedStackTrace().toArray(new StackTraceElement[0]));
        throw riveException;
    }

    @NotNull
    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final boolean getHasCppObject() {
        if (this.unsafeCppPointer == 0) {
            return false;
        }
        int i10 = 3 | 1;
        return true;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    @NotNull
    public final AtomicInteger getRefs() {
        return this.refs;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public synchronized int release() throws IllegalArgumentException {
        int iRelease;
        iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRelease == 0 && getHasCppObject()) {
            dispose();
        }
        return iRelease;
    }

    public final void setCppPointer(long j10) {
        this.unsafeCppPointer = j10;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public final void setRefs(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }
}
