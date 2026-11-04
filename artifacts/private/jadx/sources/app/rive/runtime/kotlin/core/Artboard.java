package app.rive.runtime.kotlin.core;

import android.graphics.RectF;
import androidx.annotation.m1;
import androidx.annotation.q0;
import app.rive.runtime.kotlin.core.errors.AnimationException;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@q0
@SourceDebugExtension({"SMAP\nArtboard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Artboard.kt\napp/rive/runtime/kotlin/core/Artboard\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1557#2:408\n1628#2,3:409\n1557#2:413\n1628#2,3:414\n1557#2:417\n1628#2,3:418\n1#3:412\n*S KotlinDebug\n*F\n+ 1 Artboard.kt\napp/rive/runtime/kotlin/core/Artboard\n*L\n138#1:408\n138#1:409,3\n392#1:413\n392#1:414,3\n396#1:417\n396#1:418,3\n*E\n"})
public class Artboard extends NativeObject {

    @NotNull
    private final ReentrantLock lock;

    @Nullable
    private ViewModelInstance viewModelInstance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Artboard(long j10, @NotNull ReentrantLock lock) {
        super(j10);
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
    }

    private SMIInput convertInput(SMIInput sMIInput) throws StateMachineInputException {
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

    private native boolean cppAdvance(long j10, float f10);

    private native long cppAnimationByIndex(long j10, int i10);

    private native long cppAnimationByName(long j10, String str);

    private native int cppAnimationCount(long j10);

    private native String cppAnimationNameByIndex(long j10, int i10);

    private native RectF cppBounds(long j10);

    private native void cppDraw(long j10, long j11);

    private native void cppDrawAligned(long j10, long j11, Fit fit, Alignment alignment, float f10);

    private native long cppFindTextValueRun(long j10, String str);

    private native long cppFindTextValueRunAtPath(long j10, String str, String str2);

    private native String cppFindValueOfTextValueRun(long j10, String str);

    private native String cppFindValueOfTextValueRunAtPath(long j10, String str, String str2);

    private native float cppGetArtboardHeight(long j10);

    private native float cppGetArtboardWidth(long j10);

    private native float cppGetVolume(long j10);

    private native long cppInputByNameAtPath(long j10, String str, String str2);

    private native String cppName(long j10);

    private native void cppResetArtboardSize(long j10);

    private native void cppSetArtboardHeight(long j10, float f10);

    private native void cppSetArtboardWidth(long j10, float f10);

    private native boolean cppSetValueOfTextValueRun(long j10, String str, String str2);

    private native boolean cppSetValueOfTextValueRunAtPath(long j10, String str, String str2, String str3);

    private native void cppSetViewModelInstance(long j10, long j11);

    private native void cppSetVolume(long j10, float f10);

    private native long cppStateMachineByIndex(long j10, int i10);

    private native long cppStateMachineByName(long j10, String str);

    private native int cppStateMachineCount(long j10);

    private native String cppStateMachineNameByIndex(long j10, int i10);

    public static /* synthetic */ void draw$default(Artboard artboard, long j10, Fit fit, Alignment alignment, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw");
        }
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        artboard.draw(j10, fit, alignment, f10);
    }

    public boolean advance(float f10) {
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

    @NotNull
    public LinearAnimationInstance animation(int i10) throws AnimationException {
        long jCppAnimationByIndex = cppAnimationByIndex(getCppPointer(), i10);
        if (jCppAnimationByIndex != 0) {
            LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByIndex, this.lock, 0.0f, 4, null);
            getDependencies().add(linearAnimationInstance);
            return linearAnimationInstance;
        }
        throw new AnimationException("No Animation found at index " + i10 + '.');
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);

    @m1
    public void draw(long j10) {
        synchronized (this.lock) {
            cppDraw(getCppPointer(), j10);
            Unit unit = Unit.f312394a;
        }
    }

    public int getAnimationCount() {
        return cppAnimationCount(getCppPointer());
    }

    @NotNull
    public List<String> getAnimationNames() {
        IntRange intRangeW1 = r.W1(0, getAnimationCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(cppAnimationNameByIndex(getCppPointer(), ((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    @NotNull
    public RectF getBounds() {
        return cppBounds(getCppPointer());
    }

    @NotNull
    public LinearAnimationInstance getFirstAnimation() throws AnimationException {
        return animation(0);
    }

    @NotNull
    public StateMachineInstance getFirstStateMachine() throws StateMachineException {
        return stateMachine(0);
    }

    public float getHeight() {
        return cppGetArtboardHeight(getCppPointer());
    }

    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    public int getStateMachineCount() {
        return cppStateMachineCount(getCppPointer());
    }

    @NotNull
    public List<String> getStateMachineNames() {
        IntRange intRangeW1 = r.W1(0, getStateMachineCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            arrayList.add(cppStateMachineNameByIndex(getCppPointer(), ((IntIterator) it).nextInt()));
        }
        return arrayList;
    }

    @Nullable
    public String getTextRunValue(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return cppFindValueOfTextValueRun(getCppPointer(), name);
    }

    @Nullable
    public ViewModelInstance getViewModelInstance() {
        return this.viewModelInstance;
    }

    public float getVolume() {
        return cppGetVolume(getCppPointer());
    }

    public float getWidth() {
        return cppGetArtboardWidth(getCppPointer());
    }

    @NotNull
    public SMIInput input(@NotNull String name, @NotNull String path) throws StateMachineInputException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        long jCppInputByNameAtPath = cppInputByNameAtPath(getCppPointer(), name, path);
        if (jCppInputByNameAtPath != 0) {
            return convertInput(new SMIInput(jCppInputByNameAtPath));
        }
        throw new StateMachineInputException("No StateMachineInput found with name \"" + name + "\" in nested artboard " + path + '.');
    }

    @NotNull
    public ViewModelInstance receiveViewModelInstance(@NotNull ViewModelInstance.Transfer transfer) throws ViewModelException {
        Intrinsics.checkNotNullParameter(transfer, "transfer");
        ViewModelInstance viewModelInstanceEnd$kotlin_release = transfer.end$kotlin_release();
        getDependencies().add(viewModelInstanceEnd$kotlin_release);
        setViewModelInstance(viewModelInstanceEnd$kotlin_release);
        return viewModelInstanceEnd$kotlin_release;
    }

    public void resetArtboardSize() {
        cppResetArtboardSize(getCppPointer());
    }

    public void setHeight(float f10) {
        cppSetArtboardHeight(getCppPointer(), f10);
    }

    public void setTextRunValue(@NotNull String name, @NotNull String textValue) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        if (cppSetValueOfTextValueRun(getCppPointer(), name, textValue)) {
            return;
        }
        throw new TextValueRunException("Could not set text run. No Rive TextValueRun found with name \"" + name + ".\"");
    }

    public void setViewModelInstance(@Nullable ViewModelInstance viewModelInstance) {
        if (viewModelInstance != null) {
            cppSetViewModelInstance(getCppPointer(), viewModelInstance.getCppPointer());
            this.viewModelInstance = viewModelInstance;
        }
    }

    public void setVolume$kotlin_release(float f10) {
        cppSetVolume(getCppPointer(), f10);
    }

    public void setWidth(float f10) {
        cppSetArtboardWidth(getCppPointer(), f10);
    }

    @NotNull
    public StateMachineInstance stateMachine(int i10) throws StateMachineException {
        long jCppStateMachineByIndex = cppStateMachineByIndex(getCppPointer(), i10);
        if (jCppStateMachineByIndex != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByIndex, this.lock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException("No StateMachine found at index " + i10 + '.');
    }

    @NotNull
    public RiveTextValueRun textRun(@NotNull String name) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppFindTextValueRun = cppFindTextValueRun(getCppPointer(), name);
        if (jCppFindTextValueRun != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRun);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException("No Rive TextValueRun found with name \"" + name + ".\"");
    }

    @m1
    public void draw(long j10, @NotNull Fit fit, @NotNull Alignment alignment, float f10) {
        Intrinsics.checkNotNullParameter(fit, "fit");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        synchronized (this.lock) {
            cppDrawAligned(getCppPointer(), j10, fit, alignment, f10);
            Unit unit = Unit.f312394a;
        }
    }

    @Nullable
    public String getTextRunValue(@NotNull String name, @NotNull String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        return cppFindValueOfTextValueRunAtPath(getCppPointer(), name, path);
    }

    public void setTextRunValue(@NotNull String name, @NotNull String textValue, @NotNull String path) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(path, "path");
        if (cppSetValueOfTextValueRunAtPath(getCppPointer(), name, textValue, path)) {
            return;
        }
        throw new TextValueRunException("Could not set text run value at path. No Rive TextValueRun found with name \"" + name + ".\" in nested artboard \"" + path + ".\"");
    }

    @NotNull
    public LinearAnimationInstance animation(@NotNull String name) throws AnimationException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppAnimationByName = cppAnimationByName(getCppPointer(), name);
        if (jCppAnimationByName == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Animation \"");
            sb2.append(name);
            sb2.append("\" not found. Available Animations: ");
            List<String> animationNames = getAnimationNames();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(animationNames, 10));
            Iterator<T> it = animationNames.iterator();
            while (it.hasNext()) {
                arrayList.add('\"' + ((String) it.next()) + '\"');
            }
            sb2.append(arrayList);
            sb2.append('\"');
            throw new AnimationException(sb2.toString());
        }
        LinearAnimationInstance linearAnimationInstance = new LinearAnimationInstance(jCppAnimationByName, this.lock, 0.0f, 4, null);
        getDependencies().add(linearAnimationInstance);
        return linearAnimationInstance;
    }

    @NotNull
    public StateMachineInstance stateMachine(@NotNull String name) throws StateMachineException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppStateMachineByName = cppStateMachineByName(getCppPointer(), name);
        if (jCppStateMachineByName != 0) {
            StateMachineInstance stateMachineInstance = new StateMachineInstance(jCppStateMachineByName, this.lock);
            getDependencies().add(stateMachineInstance);
            return stateMachineInstance;
        }
        throw new StateMachineException("No StateMachine found with name " + name + '.');
    }

    @NotNull
    public RiveTextValueRun textRun(@NotNull String name, @NotNull String path) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        long jCppFindTextValueRunAtPath = cppFindTextValueRunAtPath(getCppPointer(), name, path);
        if (jCppFindTextValueRunAtPath != 0) {
            RiveTextValueRun riveTextValueRun = new RiveTextValueRun(jCppFindTextValueRunAtPath);
            getDependencies().add(riveTextValueRun);
            return riveTextValueRun;
        }
        throw new TextValueRunException("No Rive TextValueRun found with name \"" + name + ".\" in nested artboard " + path);
    }
}
