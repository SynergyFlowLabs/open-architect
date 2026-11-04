package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveEventException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStateMachineInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateMachineInstance.kt\napp/rive/runtime/kotlin/core/StateMachineInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1#2:223\n1557#3:224\n1628#3,3:225\n1557#3:228\n1628#3,3:229\n1557#3:232\n1628#3,3:233\n1557#3:236\n1628#3,3:237\n*S KotlinDebug\n*F\n+ 1 StateMachineInstance.kt\napp/rive/runtime/kotlin/core/StateMachineInstance\n*L\n148#1:224\n148#1:225,3\n152#1:228\n152#1:229,3\n215#1:232\n215#1:233,3\n220#1:236\n220#1:237,3\n*E\n"})
public final class StateMachineInstance extends NativeObject implements PlayableInstance {

    @NotNull
    private final ReentrantLock lock;

    @Nullable
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachineInstance(long j10, @NotNull ReentrantLock lock) {
        super(j10);
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
    }

    private final SMIInput convertInput(SMIInput sMIInput) throws StateMachineInputException {
        if (sMIInput.isBoolean()) {
            return new SMIBoolean(sMIInput.getCppPointer());
        }
        if (sMIInput.isTrigger()) {
            return new SMITrigger(sMIInput.getCppPointer());
        }
        if (sMIInput.isNumber()) {
            return new SMINumber(sMIInput.getCppPointer());
        }
        throw new StateMachineInputException("Unknown State Machine Input Instance for " + sMIInput.getName() + '.');
    }

    private final LayerState convertLayerState(LayerState layerState) throws StateMachineInputException {
        if (layerState.isAnimationState()) {
            return new AnimationState(layerState.getCppPointer());
        }
        if (layerState.isAnyState()) {
            return new AnyState(layerState.getCppPointer());
        }
        if (layerState.isEntryState()) {
            return new EntryState(layerState.getCppPointer());
        }
        if (layerState.isExitState()) {
            return new ExitState(layerState.getCppPointer());
        }
        if (layerState.isBlendState()) {
            return new BlendState(layerState.getCppPointer());
        }
        throw new StateMachineInputException("Unknown Layer State for " + layerState + '.');
    }

    private final native boolean cppAdvance(long j10, float f10);

    private final native int cppInputCount(long j10);

    private final native int cppLayerCount(long j10);

    private final native String cppName(long j10);

    private final native void cppPointerDown(long j10, float f10, float f11);

    private final native void cppPointerMove(long j10, float f10, float f11);

    private final native void cppPointerUp(long j10, float f10, float f11);

    private final native RiveEventReport cppReportedEventAt(long j10, int i10);

    private final native int cppReportedEventCount(long j10);

    private final native long cppSMIInputByIndex(long j10, int i10);

    private final native void cppSetViewModelInstance(long j10, long j11);

    private final native long cppStateChangedByIndex(long j10, int i10);

    private final native int cppStateChangedCount(long j10);

    private final int getReportedEventCount() {
        return cppReportedEventCount(getCppPointer());
    }

    private final int getStateChangedCount() {
        return cppStateChangedCount(getCppPointer());
    }

    public final boolean advance(float f10) {
        boolean zCppAdvance;
        synchronized (this.lock) {
            try {
                zCppAdvance = cppAdvance(getCppPointer(), f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zCppAdvance;
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);

    @NotNull
    public final RiveEvent eventAt(int i10) throws RiveEventException {
        RiveEventReport riveEventReportCppReportedEventAt = cppReportedEventAt(getCppPointer(), i10);
        if (riveEventReportCppReportedEventAt.getUnsafeCppPointer() != 0) {
            return riveEventReportCppReportedEventAt.getEvent();
        }
        throw new RiveEventException("No Rive Event found at index " + i10 + '.');
    }

    @NotNull
    public final List<RiveEvent> getEventsReported() {
        IntRange intRangeW1 = r.W1(0, getReportedEventCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(eventAt(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public final int getInputCount() {
        return cppInputCount(getCppPointer());
    }

    @NotNull
    public final List<String> getInputNames() {
        IntRange intRangeW1 = r.W1(0, getInputCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(input(((IntIterator) it).nextInt()).getName());
        }
        return arrayList;
    }

    @NotNull
    public final List<SMIInput> getInputs() {
        IntRange intRangeW1 = r.W1(0, getInputCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(input(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    public final int getLayerCount() {
        return cppLayerCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public final List<LayerState> getStatesChanged() {
        IntRange intRangeW1 = r.W1(0, getStateChangedCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(stateChanged(((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    @Nullable
    public final ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    @NotNull
    public final SMIInput input(int i10) throws StateMachineInputException {
        long jCppSMIInputByIndex = cppSMIInputByIndex(getCppPointer(), i10);
        if (jCppSMIInputByIndex != 0) {
            return convertInput(new SMIInput(jCppSMIInputByIndex));
        }
        throw new StateMachineInputException("No StateMachineInput found at index " + i10 + '.');
    }

    public final void pointerDown(float f10, float f11) {
        synchronized (this.lock) {
            try {
                cppPointerDown(getCppPointer(), f10, f11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void pointerMove(float f10, float f11) {
        synchronized (this.lock) {
            try {
                cppPointerMove(getCppPointer(), f10, f11);
            } finally {
            }
        }
    }

    public final void pointerUp(float f10, float f11) {
        synchronized (this.lock) {
            cppPointerUp(getCppPointer(), f10, f11);
        }
    }

    @NotNull
    public final ViewModelInstance receiveViewModelInstance(@NotNull ViewModelInstance.Transfer transfer) throws ViewModelException {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public final void setViewModelInstance(@Nullable ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
        }
        this.viewModelInstance = viewModelInstance;
    }

    @NotNull
    public final LayerState stateChanged(int i10) throws StateMachineInputException {
        long jCppStateChangedByIndex = cppStateChangedByIndex(getCppPointer(), i10);
        if (jCppStateChangedByIndex != 0) {
            return convertLayerState(new LayerState(jCppStateChangedByIndex));
        }
        throw new StateMachineInputException("No LayerState found at index " + i10 + '.');
    }

    @NotNull
    public final SMIInput input(@NotNull String name) throws StateMachineInputException {
        Intrinsics.checkNotNullParameter(name, "name");
        int inputCount = getInputCount();
        for (int i10 = 0; i10 < inputCount; i10++) {
            SMIInput sMIInputInput = input(i10);
            if (Intrinsics.areEqual(sMIInputInput.getName(), name)) {
                return sMIInputInput;
            }
        }
        throw new StateMachineInputException("No StateMachineInput found with name " + name + '.');
    }
}
