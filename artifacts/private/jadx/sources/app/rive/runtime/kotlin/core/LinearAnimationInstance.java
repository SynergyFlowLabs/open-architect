package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nLinearAnimationInstance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinearAnimationInstance.kt\napp/rive/runtime/kotlin/core/LinearAnimationInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
public final class LinearAnimationInstance extends NativeObject implements PlayableInstance {

    @NotNull
    private final ReentrantLock lock;
    private float mix;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ADVANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvanceResult.LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvanceResult.PINGPONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LinearAnimationInstance(long j10, ReentrantLock reentrantLock, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, reentrantLock, (i10 & 4) != 0 ? 1.0f : f10);
    }

    private final native Loop cppAdvance(long j10, float f10);

    private final native AdvanceResult cppAdvanceAndGetResult(long j10, float f10);

    private final native void cppApply(long j10, float f10);

    private final native int cppDuration(long j10);

    private final native int cppFps(long j10);

    private final native int cppGetDirection(long j10);

    private final native int cppGetLoop(long j10);

    private final native float cppGetTime(long j10);

    private final native String cppName(long j10);

    private final native void cppSetDirection(long j10, int i10);

    private final native void cppSetLoop(long j10, int i10);

    private final native void cppSetTime(long j10, float f10);

    private final native int cppWorkEnd(long j10);

    private final native int cppWorkStart(long j10);

    @l(message = "Use advanceAndGetResult instead.", replaceWith = @b1(expression = "advanceAndGetResult(elapsedTime)", imports = {}))
    @Nullable
    public final Loop advance(float f10) {
        Loop loopCppAdvance;
        synchronized (this.lock) {
            loopCppAdvance = cppAdvance(getCppPointer(), f10);
        }
        return loopCppAdvance;
    }

    @NotNull
    public final AdvanceResult advanceAndGetResult(float f10) {
        AdvanceResult advanceResultCppAdvanceAndGetResult;
        synchronized (this.lock) {
            try {
                advanceResultCppAdvanceAndGetResult = cppAdvanceAndGetResult(getCppPointer(), f10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return advanceResultCppAdvanceAndGetResult;
    }

    public final void apply() {
        synchronized (this.lock) {
            cppApply(getCppPointer(), this.mix);
            Unit unit = Unit.f312394a;
        }
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long j10);

    @NotNull
    public final Direction getDirection() {
        Direction directionFromInt = Direction.Companion.fromInt(cppGetDirection(getCppPointer()));
        if (directionFromInt != null) {
            return directionFromInt;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getDuration() {
        return cppDuration(getCppPointer());
    }

    public final int getEffectiveDuration() {
        return getWorkStart() == -1 ? getDuration() : getWorkEnd() - getWorkStart();
    }

    public final float getEffectiveDurationInSeconds() {
        return getEffectiveDuration() / getFps();
    }

    public final float getEndTime() {
        float workEnd;
        int fps;
        if (getWorkEnd() == -1) {
            workEnd = getDuration();
            fps = getFps();
        } else {
            workEnd = getWorkEnd();
            fps = getFps();
        }
        return workEnd / fps;
    }

    public final int getFps() {
        return cppFps(getCppPointer());
    }

    @NotNull
    public final Loop getLoop() {
        return Loop.Companion.fromIndex(cppGetLoop(getCppPointer()));
    }

    public final float getMix() {
        return this.mix;
    }

    @Override // app.rive.runtime.kotlin.core.PlayableInstance
    @NotNull
    public String getName() {
        return cppName(getCppPointer());
    }

    public final float getStartTime() {
        if (getWorkStart() == -1) {
            return 0.0f;
        }
        return getWorkStart() / getFps();
    }

    public final float getTime() {
        return cppGetTime(getCppPointer());
    }

    public final int getWorkEnd() {
        return cppWorkEnd(getCppPointer());
    }

    public final int getWorkStart() {
        return cppWorkStart(getCppPointer());
    }

    public final void setDirection(@NotNull Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        synchronized (this.lock) {
            cppSetDirection(getCppPointer(), direction.getValue());
            Unit unit = Unit.f312394a;
        }
    }

    public final void setLoop(@NotNull Loop loop) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        synchronized (this.lock) {
            try {
                cppSetLoop(getCppPointer(), loop.ordinal());
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setMix(float f10) {
        this.mix = f10;
    }

    public final void time(float f10) {
        synchronized (this.lock) {
            cppSetTime(getCppPointer(), f10);
            Unit unit = Unit.f312394a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearAnimationInstance(long j10, @NotNull ReentrantLock lock, float f10) {
        super(j10);
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.lock = lock;
        this.mix = f10;
    }

    public final boolean apply(float f10) {
        synchronized (this.lock) {
            try {
                cppApply(getCppPointer(), this.mix);
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[advanceAndGetResult(f10).ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4 || i10 == 5) {
            return false;
        }
        throw new k0();
    }
}
