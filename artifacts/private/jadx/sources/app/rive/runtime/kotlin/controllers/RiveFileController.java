package app.rive.runtime.kotlin.controllers;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.i;
import androidx.annotation.l1;
import androidx.annotation.m1;
import app.rive.runtime.kotlin.ChangedInput;
import app.rive.runtime.kotlin.Observable;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.core.AdvanceResult;
import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.Direction;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.Fit;
import app.rive.runtime.kotlin.core.Helpers;
import app.rive.runtime.kotlin.core.LayerState;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.Loop;
import app.rive.runtime.kotlin.core.PlayableInstance;
import app.rive.runtime.kotlin.core.RefCount;
import app.rive.runtime.kotlin.core.RiveEvent;
import app.rive.runtime.kotlin.core.SMIBoolean;
import app.rive.runtime.kotlin.core.SMIInput;
import app.rive.runtime.kotlin.core.SMINumber;
import app.rive.runtime.kotlin.core.SMITrigger;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import app.rive.runtime.kotlin.core.ViewModelInstance;
import app.rive.runtime.kotlin.core.errors.StateMachineException;
import app.rive.runtime.kotlin.core.errors.StateMachineInputException;
import app.rive.runtime.kotlin.core.errors.TextValueRunException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import app.rive.runtime.kotlin.renderers.PointerEvents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRiveFileController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveFileController.kt\napp/rive/runtime/kotlin/controllers/RiveFileController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1077:1\n1#2:1078\n1#2:1103\n1863#3,2:1079\n1863#3,2:1081\n1863#3,2:1083\n1863#3,2:1085\n1863#3,2:1087\n1863#3,2:1089\n1863#3,2:1091\n1611#3,9:1093\n1863#3:1102\n1864#3:1104\n1620#3:1105\n1863#3,2:1106\n1863#3,2:1108\n1863#3,2:1110\n1863#3,2:1112\n1863#3,2:1114\n1863#3,2:1116\n1863#3,2:1118\n1863#3,2:1120\n1863#3,2:1122\n1863#3,2:1124\n1863#3,2:1126\n1863#3,2:1128\n1863#3,2:1130\n1863#3,2:1132\n1863#3,2:1134\n1863#3,2:1136\n1863#3,2:1138\n1863#3,2:1140\n1863#3,2:1142\n1863#3,2:1144\n1863#3,2:1146\n774#3:1148\n865#3,2:1149\n774#3:1151\n865#3,2:1152\n1863#3,2:1154\n1863#3,2:1156\n1863#3,2:1158\n1863#3,2:1160\n1863#3,2:1162\n1863#3,2:1164\n1863#3,2:1166\n1863#3,2:1168\n1863#3,2:1170\n1863#3,2:1172\n1863#3,2:1174\n1863#3,2:1176\n*S KotlinDebug\n*F\n+ 1 RiveFileController.kt\napp/rive/runtime/kotlin/controllers/RiveFileController\n*L\n373#1:1103\n294#1:1079,2\n295#1:1081,2\n296#1:1083,2\n297#1:1085,2\n322#1:1087,2\n354#1:1089,2\n369#1:1091,2\n373#1:1093,9\n373#1:1102\n373#1:1104\n373#1:1105\n374#1:1106,2\n458#1:1108,2\n487#1:1110,2\n525#1:1112,2\n528#1:1114,2\n556#1:1116,2\n557#1:1118,2\n562#1:1120,2\n564#1:1122,2\n570#1:1124,2\n572#1:1126,2\n580#1:1128,2\n585#1:1130,2\n591#1:1132,2\n593#1:1134,2\n600#1:1136,2\n602#1:1138,2\n650#1:1140,2\n674#1:1142,2\n743#1:1144,2\n756#1:1146,2\n781#1:1148\n781#1:1149,2\n785#1:1151\n785#1:1152,2\n809#1:1154,2\n812#1:1156,2\n827#1:1158,2\n833#1:1160,2\n934#1:1162,2\n1006#1:1164,2\n1010#1:1166,2\n1014#1:1168,2\n1018#1:1170,2\n1023#1:1172,2\n1027#1:1174,2\n1031#1:1176,2\n*E\n"})
public final class RiveFileController implements Observable<Listener>, RefCount {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "RiveFileController";

    @NotNull
    private Set<RiveEventListener> _eventListeners;

    @NotNull
    private Set<Listener> _listeners;

    @Nullable
    private Artboard activeArtboard;

    @NotNull
    private Alignment alignment;
    private List<LinearAnimationInstance> animationList;
    private boolean autoplay;

    @NotNull
    private final ConcurrentLinkedQueue<ChangedInput> changedInputs;

    @Nullable
    private File file;

    @NotNull
    private Fit fit;
    private boolean isActive;

    @Nullable
    private Float layoutScaleFactor;
    private float layoutScaleFactorAutomatic;

    @NotNull
    private Loop loop;

    @Nullable
    private Function0<Unit> onStart;
    private Set<LinearAnimationInstance> playingAnimationSet;
    private Set<StateMachineInstance> playingStateMachineSet;

    @NotNull
    private AtomicInteger refs;

    @NotNull
    private AtomicBoolean requireArtboardResize;

    @NotNull
    private final ReentrantLock startStopLock;
    private List<StateMachineInstance> stateMachineList;

    @NotNull
    private RectF targetBounds;

    @Nullable
    private Float userSetVolume;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public interface Listener {

        public static final class DefaultImpls {
            public static void notifyAdvance(@NotNull Listener listener, float f10) {
            }
        }

        void notifyAdvance(float f10);

        void notifyLoop(@NotNull PlayableInstance playableInstance);

        void notifyPause(@NotNull PlayableInstance playableInstance);

        void notifyPlay(@NotNull PlayableInstance playableInstance);

        void notifyStateChanged(@NotNull String str, @NotNull String str2);

        void notifyStop(@NotNull PlayableInstance playableInstance);
    }

    public interface RiveEventListener {
        void notifyEvent(@NotNull RiveEvent riveEvent);
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AdvanceResult.values().length];
            try {
                iArr[AdvanceResult.ONESHOT.ordinal()] = 1;
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
                iArr[AdvanceResult.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvanceResult.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PointerEvents.values().length];
            try {
                iArr2[PointerEvents.POINTER_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PointerEvents.POINTER_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PointerEvents.POINTER_MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RiveFileController() {
        this(null, false, null, null, null, null, 63, null);
    }

    private final List<LinearAnimationInstance> animations(String str) {
        return animations(CollectionsKt.listOf(str));
    }

    public static /* synthetic */ void fireState$default(RiveFileController riveFileController, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        riveFileController.fireState(str, str2, str3);
    }

    @l1(otherwise = 2)
    public static /* synthetic */ void getEventListeners$annotations() {
    }

    @l1(otherwise = 2)
    public static /* synthetic */ void getListeners$annotations() {
    }

    private final List<StateMachineInstance> getOrCreateStateMachines(String str) throws StateMachineException {
        Artboard artboard;
        List<StateMachineInstance> listStateMachines = stateMachines(str);
        if (!listStateMachines.isEmpty() || (artboard = this.activeArtboard) == null) {
            return listStateMachines;
        }
        StateMachineInstance stateMachineInstanceStateMachine = artboard.stateMachine(str);
        this.stateMachineList.add(stateMachineInstanceStateMachine);
        return CollectionsKt.listOf(stateMachineInstanceStateMachine);
    }

    @m1
    private final void notifyAdvance(float f10) {
        Iterator it = CollectionsKt.toList(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyAdvance(f10);
        }
    }

    private final void notifyEvent(RiveEvent riveEvent) {
        Iterator it = CollectionsKt.toList(getEventListeners()).iterator();
        while (it.hasNext()) {
            ((RiveEventListener) it.next()).notifyEvent(riveEvent);
        }
    }

    private final void notifyLoop(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.toList(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyLoop(playableInstance);
        }
    }

    private final void notifyPause(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.toList(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPause(playableInstance);
        }
    }

    private final void notifyPlay(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.toList(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyPlay(playableInstance);
        }
    }

    private final void notifyStateChanged(StateMachineInstance stateMachineInstance, LayerState layerState) {
        Iterator it = CollectionsKt.toList(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStateChanged(stateMachineInstance.getName(), layerState.toString());
        }
    }

    private final void notifyStop(PlayableInstance playableInstance) {
        Iterator it = CollectionsKt.toList(getListeners()).iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).notifyStop(playableInstance);
        }
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveFileController.pause((List<String>) list, z10);
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, List list, Loop loop, Direction direction, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i10 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        riveFileController.play((List<String>) list, loop2, direction2, z12, z11);
    }

    public static /* synthetic */ void play$kotlin_release$default(RiveFileController riveFileController, StateMachineInstance stateMachineInstance, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        riveFileController.play$kotlin_release(stateMachineInstance, z10);
    }

    private final void playAnimation(String str, Loop loop, Direction direction, boolean z10, boolean z11) {
        Artboard artboard;
        if (z10) {
            Iterator<T> it = getOrCreateStateMachines(str).iterator();
            while (it.hasNext()) {
                play$kotlin_release((StateMachineInstance) it.next(), z11);
            }
        } else {
            List<LinearAnimationInstance> listAnimations = animations(str);
            Iterator<T> it2 = listAnimations.iterator();
            while (it2.hasNext()) {
                play$kotlin_release((LinearAnimationInstance) it2.next(), loop, direction);
            }
            if (listAnimations.isEmpty() && (artboard = this.activeArtboard) != null) {
                play$kotlin_release(artboard.animation(str), loop, direction);
            }
        }
    }

    static /* synthetic */ void playAnimation$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i10 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        riveFileController.playAnimation(str, loop2, direction2, z12, z11);
    }

    @m1
    private final void processAllInputs() throws StateMachineInputException {
        ChangedInput changedInputPoll;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (!this.changedInputs.isEmpty() && (changedInputPoll = this.changedInputs.poll()) != null) {
            if (changedInputPoll.getNestedArtboardPath() == null) {
                for (StateMachineInstance stateMachineInstance : getOrCreateStateMachines(changedInputPoll.getStateMachineName())) {
                    linkedHashSet.add(stateMachineInstance);
                    SMIInput sMIInputInput = stateMachineInstance.input(changedInputPoll.getName());
                    if (sMIInputInput instanceof SMITrigger) {
                        ((SMITrigger) sMIInputInput).fire$kotlin_release();
                    } else if (sMIInputInput instanceof SMIBoolean) {
                        Object value = changedInputPoll.getValue();
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Boolean");
                        ((SMIBoolean) sMIInputInput).setValue$kotlin_release(((Boolean) value).booleanValue());
                    } else if (sMIInputInput instanceof SMINumber) {
                        Object value2 = changedInputPoll.getValue();
                        Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Float");
                        ((SMINumber) sMIInputInput).setValue$kotlin_release(((Float) value2).floatValue());
                    }
                }
            } else {
                Artboard artboard = this.activeArtboard;
                SMIInput sMIInputInput2 = artboard != null ? artboard.input(changedInputPoll.getName(), changedInputPoll.getNestedArtboardPath()) : null;
                if (sMIInputInput2 instanceof SMITrigger) {
                    ((SMITrigger) sMIInputInput2).fire$kotlin_release();
                } else if (sMIInputInput2 instanceof SMIBoolean) {
                    Object value3 = changedInputPoll.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                    ((SMIBoolean) sMIInputInput2).setValue$kotlin_release(((Boolean) value3).booleanValue());
                } else if (sMIInputInput2 instanceof SMINumber) {
                    Object value4 = changedInputPoll.getValue();
                    Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Float");
                    ((SMINumber) sMIInputInput2).setValue$kotlin_release(((Float) value4).floatValue());
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int i10 = 4 | 0;
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    private final void queueInput(String str, String str2, Object obj, String str3) {
        queueInputs$kotlin_release(new ChangedInput(str, str2, obj, str3));
    }

    static /* synthetic */ void queueInput$default(RiveFileController riveFileController, String str, String str2, Object obj, String str3, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            obj = null;
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        riveFileController.queueInput(str, str2, obj, str3);
    }

    private final boolean resolveStateMachineAdvance(StateMachineInstance stateMachineInstance, float f10) {
        if (!getEventListeners().isEmpty()) {
            Iterator<T> it = stateMachineInstance.getEventsReported().iterator();
            while (it.hasNext()) {
                notifyEvent((RiveEvent) it.next());
            }
        }
        boolean zAdvance = stateMachineInstance.advance(f10);
        if (!getListeners().isEmpty()) {
            Iterator<T> it2 = stateMachineInstance.getStatesChanged().iterator();
            while (it2.hasNext()) {
                notifyStateChanged(stateMachineInstance, (LayerState) it2.next());
            }
        }
        return zAdvance;
    }

    public static /* synthetic */ void selectArtboard$default(RiveFileController riveFileController, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        riveFileController.selectArtboard(str);
    }

    private final void setArtboard(Artboard artboard) {
        if (Intrinsics.areEqual(artboard, this.activeArtboard)) {
            return;
        }
        stopAnimations();
        setActiveArtboard(artboard);
        autoplay();
    }

    public static /* synthetic */ void setBooleanState$default(RiveFileController riveFileController, String str, String str2, boolean z10, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        riveFileController.setBooleanState(str, str2, z10, str3);
    }

    public static /* synthetic */ void setNumberState$default(RiveFileController riveFileController, String str, String str2, float f10, String str3, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str3 = null;
            int i11 = 6 | 0;
        }
        riveFileController.setNumberState(str, str2, f10, str3);
    }

    public static /* synthetic */ void setRiveFile$default(RiveFileController riveFileController, File file, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        riveFileController.setRiveFile(file, str);
    }

    private final List<StateMachineInstance> stateMachines(String str) {
        return stateMachines(CollectionsKt.listOf(str));
    }

    private final void stop(LinearAnimationInstance linearAnimationInstance) {
        this.playingAnimationSet.remove(linearAnimationInstance);
        if (this.animationList.remove(linearAnimationInstance)) {
            notifyStop(linearAnimationInstance);
        }
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveFileController.stopAnimations((List<String>) list, z10);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    @i
    public int acquire() {
        return RefCount.DefaultImpls.acquire(this);
    }

    public final void addEventListener(@NotNull RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.startStopLock) {
            this._eventListeners.add(listener);
        }
    }

    @m1
    public final void advance(float f10) {
        ReentrantLock lock;
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            return;
        }
        synchronized (lock) {
            try {
                Artboard artboard = this.activeArtboard;
                if (artboard != null) {
                    processAllInputs();
                    boolean zIsEmpty = false;
                    for (LinearAnimationInstance linearAnimationInstance : getAnimations()) {
                        if (getPlayingAnimations().contains(linearAnimationInstance)) {
                            AdvanceResult advanceResultAdvanceAndGetResult = linearAnimationInstance.advanceAndGetResult(f10);
                            linearAnimationInstance.apply();
                            int i10 = WhenMappings.$EnumSwitchMapping$0[advanceResultAdvanceAndGetResult.ordinal()];
                            if (i10 == 1) {
                                stop(linearAnimationInstance);
                            } else if (i10 == 2 || i10 == 3) {
                                notifyLoop(linearAnimationInstance);
                            } else if (i10 == 4) {
                                zIsEmpty = getPlayingStateMachines().isEmpty();
                            } else if (i10 != 5) {
                                throw new k0();
                            }
                        }
                    }
                    if (zIsEmpty) {
                        artboard.advance(f10);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (StateMachineInstance stateMachineInstance : getStateMachines()) {
                        if (getPlayingStateMachines().contains(stateMachineInstance) && !resolveStateMachineAdvance(stateMachineInstance, f10)) {
                            arrayList.add(stateMachineInstance);
                        }
                    }
                    if (f10 > 0.0d) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            pause((StateMachineInstance) it.next());
                        }
                    }
                    HashSet<StateMachineInstance> playingStateMachines = getPlayingStateMachines();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it2 = playingStateMachines.iterator();
                    while (it2.hasNext()) {
                        ViewModelInstance viewModelInstance = ((StateMachineInstance) it2.next()).getViewModelInstance();
                        if (viewModelInstance != null) {
                            arrayList2.add(viewModelInstance);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((ViewModelInstance) it3.next()).pollChanges$kotlin_release();
                    }
                    notifyAdvance(f10);
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void autoplay() {
        if (this.autoplay) {
            int i10 = 6 << 0;
            play$default(this, null, null, true, 3, null);
            return;
        }
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.advance(0.0f);
        }
        synchronized (this.startStopLock) {
            Function0<Unit> function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
                Unit unit = Unit.f312394a;
            }
        }
    }

    public final void fireState(@NotNull String stateMachineName, @NotNull String inputName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        queueInput$default(this, stateMachineName, inputName, null, str, 4, null);
    }

    public final void fireStateAtPath(@NotNull String inputName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        queueInput$default(this, "", inputName, null, path, 4, null);
    }

    @Nullable
    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final List<LinearAnimationInstance> getAnimations() {
        List<LinearAnimationInstance> list;
        List<LinearAnimationInstance> animationList = this.animationList;
        Intrinsics.checkNotNullExpressionValue(animationList, "animationList");
        synchronized (animationList) {
            try {
                List<LinearAnimationInstance> animationList2 = this.animationList;
                Intrinsics.checkNotNullExpressionValue(animationList2, "animationList");
                list = CollectionsKt.toList(animationList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @NotNull
    public final RectF getArtboardBounds() {
        RectF bounds;
        Artboard artboard = this.activeArtboard;
        return (artboard == null || (bounds = artboard.getBounds()) == null) ? new RectF() : bounds;
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    @l1(otherwise = 2)
    @NotNull
    public final ConcurrentLinkedQueue<ChangedInput> getChangedInputs$kotlin_release() {
        return this.changedInputs;
    }

    @NotNull
    public final HashSet<RiveEventListener> getEventListeners() {
        HashSet<RiveEventListener> hashSet;
        synchronized (this._eventListeners) {
            hashSet = CollectionsKt.toHashSet(this._eventListeners);
        }
        return hashSet;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final Fit getFit() {
        return this.fit;
    }

    @Nullable
    public final Float getLayoutScaleFactor() {
        return this.layoutScaleFactor;
    }

    public final float getLayoutScaleFactorActive$kotlin_release() {
        Float f10 = this.layoutScaleFactor;
        return f10 != null ? f10.floatValue() : this.layoutScaleFactorAutomatic;
    }

    public final float getLayoutScaleFactorAutomatic() {
        return this.layoutScaleFactorAutomatic;
    }

    @NotNull
    public final HashSet<Listener> getListeners() {
        HashSet<Listener> hashSet;
        synchronized (this._listeners) {
            try {
                hashSet = CollectionsKt.toHashSet(this._listeners);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    @NotNull
    public final Loop getLoop() {
        return this.loop;
    }

    @Nullable
    public final Function0<Unit> getOnStart() {
        return this.onStart;
    }

    @NotNull
    public final Set<LinearAnimationInstance> getPausedAnimations() {
        return CollectionsKt.subtract(getAnimations(), getPlayingAnimations());
    }

    @NotNull
    public final Set<StateMachineInstance> getPausedStateMachines() {
        return CollectionsKt.subtract(getStateMachines(), getPlayingStateMachines());
    }

    @NotNull
    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        HashSet<LinearAnimationInstance> hashSet;
        Set<LinearAnimationInstance> playingAnimationSet = this.playingAnimationSet;
        Intrinsics.checkNotNullExpressionValue(playingAnimationSet, "playingAnimationSet");
        synchronized (playingAnimationSet) {
            try {
                Set<LinearAnimationInstance> playingAnimationSet2 = this.playingAnimationSet;
                Intrinsics.checkNotNullExpressionValue(playingAnimationSet2, "playingAnimationSet");
                hashSet = CollectionsKt.toHashSet(playingAnimationSet2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    @NotNull
    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        HashSet<StateMachineInstance> hashSet;
        Set<StateMachineInstance> playingStateMachineSet = this.playingStateMachineSet;
        Intrinsics.checkNotNullExpressionValue(playingStateMachineSet, "playingStateMachineSet");
        synchronized (playingStateMachineSet) {
            Set<StateMachineInstance> playingStateMachineSet2 = this.playingStateMachineSet;
            Intrinsics.checkNotNullExpressionValue(playingStateMachineSet2, "playingStateMachineSet");
            hashSet = CollectionsKt.toHashSet(playingStateMachineSet2);
        }
        return hashSet;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    @NotNull
    public AtomicInteger getRefs() {
        return this.refs;
    }

    @NotNull
    public final AtomicBoolean getRequireArtboardResize$kotlin_release() {
        return this.requireArtboardResize;
    }

    @NotNull
    public final ReentrantLock getStartStopLock$kotlin_release() {
        return this.startStopLock;
    }

    @NotNull
    public final List<StateMachineInstance> getStateMachines() {
        List<StateMachineInstance> list;
        List<StateMachineInstance> stateMachineList = this.stateMachineList;
        Intrinsics.checkNotNullExpressionValue(stateMachineList, "stateMachineList");
        synchronized (stateMachineList) {
            try {
                List<StateMachineInstance> stateMachineList2 = this.stateMachineList;
                Intrinsics.checkNotNullExpressionValue(stateMachineList2, "stateMachineList");
                list = CollectionsKt.toList(stateMachineList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    @NotNull
    public final RectF getTargetBounds() {
        return this.targetBounds;
    }

    @Nullable
    public final String getTextRunValue(@NotNull String textRunName) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(textRunName);
        }
        return null;
    }

    @Nullable
    public final Float getVolume() {
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return Float.valueOf(artboard.getVolume());
        }
        return null;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isAdvancing() {
        Set<LinearAnimationInstance> playingAnimationSet = this.playingAnimationSet;
        Intrinsics.checkNotNullExpressionValue(playingAnimationSet, "playingAnimationSet");
        if (playingAnimationSet.isEmpty()) {
            Set<StateMachineInstance> playingStateMachineSet = this.playingStateMachineSet;
            Intrinsics.checkNotNullExpressionValue(playingStateMachineSet, "playingStateMachineSet");
            if (playingStateMachineSet.isEmpty() && this.changedInputs.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final void pause() {
        Iterator<T> it = getPlayingAnimations().iterator();
        while (it.hasNext()) {
            pause((LinearAnimationInstance) it.next());
        }
        Iterator<T> it2 = getPlayingStateMachines().iterator();
        while (it2.hasNext()) {
            pause((StateMachineInstance) it2.next());
        }
    }

    public final void play(@NotNull List<String> animationNames, @NotNull Loop loop, @NotNull Direction direction, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Iterator<T> it = animationNames.iterator();
        while (it.hasNext()) {
            playAnimation((String) it.next(), loop, direction, z10, z11);
        }
    }

    public final void play$kotlin_release(@NotNull StateMachineInstance stateMachineInstance, boolean z10) {
        Intrinsics.checkNotNullParameter(stateMachineInstance, "stateMachineInstance");
        if (!this.stateMachineList.contains(stateMachineInstance)) {
            this.stateMachineList.add(stateMachineInstance);
        }
        if (z10) {
            resolveStateMachineAdvance(stateMachineInstance, 0.0f);
        }
        synchronized (this.startStopLock) {
            this.playingStateMachineSet.add(stateMachineInstance);
            Function0<Unit> function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
                Unit unit = Unit.f312394a;
            }
        }
        notifyPlay(stateMachineInstance);
    }

    public final void pointerEvent(@NotNull PointerEvents eventType, float f10, float f11) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Helpers helpers = Helpers.INSTANCE;
        RectF rectF2 = this.targetBounds;
        PointF pointF = new PointF(f10, f11);
        Fit fit = this.fit;
        Alignment alignment = this.alignment;
        Artboard artboard = this.activeArtboard;
        if (artboard == null || (rectF = artboard.getBounds()) == null) {
            rectF = new RectF();
        }
        PointF pointFConvertToArtboardSpace = helpers.convertToArtboardSpace(rectF2, pointF, fit, alignment, rectF, getLayoutScaleFactorActive$kotlin_release());
        for (StateMachineInstance stateMachineInstance : getStateMachines()) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[eventType.ordinal()];
            if (i10 == 1) {
                stateMachineInstance.pointerDown(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            } else if (i10 == 2) {
                stateMachineInstance.pointerUp(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            } else {
                if (i10 != 3) {
                    throw new k0();
                }
                stateMachineInstance.pointerMove(pointFConvertToArtboardSpace.x, pointFConvertToArtboardSpace.y);
            }
            play$kotlin_release(stateMachineInstance, false);
        }
    }

    public final void queueInputs$kotlin_release(@NotNull ChangedInput... inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        synchronized (this.startStopLock) {
            try {
                CollectionsKt.addAll(this.changedInputs, inputs);
                Function0<Unit> function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public int release() throws IllegalStateException {
        int iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRelease != 0) {
            return iRelease;
        }
        if (this.isActive) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setFile(null);
        return iRelease;
    }

    public final void removeEventListener(@NotNull RiveEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.startStopLock) {
            try {
                this._eventListeners.remove(listener);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reset$kotlin_release() {
        this.playingAnimationSet.clear();
        this.animationList.clear();
        this.playingStateMachineSet.clear();
        this.stateMachineList.clear();
        this.changedInputs.clear();
        setActiveArtboard(null);
    }

    @ControllerStateManagement
    public final void restoreControllerState(@NotNull ControllerState state) {
        Object lock;
        Intrinsics.checkNotNullParameter(state, "state");
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                reset$kotlin_release();
                setFile(state.getFile());
                setActiveArtboard(state.getActiveArtboard());
                Iterator<T> it = state.getAnimations().iterator();
                while (it.hasNext()) {
                    this.animationList.add((LinearAnimationInstance) it.next());
                }
                Iterator<T> it2 = state.getStateMachines().iterator();
                while (it2.hasNext()) {
                    this.stateMachineList.add((StateMachineInstance) it2.next());
                }
                for (LinearAnimationInstance linearAnimationInstance : state.getPlayingAnimations()) {
                    play$kotlin_release(linearAnimationInstance, linearAnimationInstance.getLoop(), linearAnimationInstance.getDirection());
                }
                Iterator<T> it3 = state.getPlayingStateMachines().iterator();
                while (it3.hasNext()) {
                    int i10 = 2 ^ 0;
                    play$kotlin_release$default(this, (StateMachineInstance) it3.next(), false, 2, null);
                }
                this.isActive = state.isActive();
                state.dispose();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @ControllerStateManagement
    @Nullable
    public final ControllerState saveControllerState() {
        Artboard artboard;
        File file = this.file;
        if (file != null && (artboard = this.activeArtboard) != null) {
            synchronized (file.getLock()) {
                try {
                    if (!file.getHasCppObject()) {
                        return null;
                    }
                    file.acquire();
                    artboard.acquire();
                    List<LinearAnimationInstance> animationList = this.animationList;
                    Intrinsics.checkNotNullExpressionValue(animationList, "animationList");
                    List list = CollectionsKt.toList(animationList);
                    HashSet hashSet = CollectionsKt.toHashSet(getPlayingAnimations());
                    List<StateMachineInstance> stateMachineList = this.stateMachineList;
                    Intrinsics.checkNotNullExpressionValue(stateMachineList, "stateMachineList");
                    return new ControllerState(file, artboard, list, hashSet, CollectionsKt.toList(stateMachineList), CollectionsKt.toHashSet(getPlayingStateMachines()), this.isActive);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }

    public final void selectArtboard(@Nullable String str) {
        File file = this.file;
        if (file != null) {
            setArtboard(str != null ? file.artboard(str) : file.getFirstArtboard());
        }
    }

    public final void setActive(boolean z10) {
        this.isActive = z10;
    }

    public final void setActiveArtboard(@Nullable Artboard artboard) {
        Object lock;
        if (Intrinsics.areEqual(artboard, this.activeArtboard)) {
            return;
        }
        File file = this.file;
        if (file == null || (lock = file.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                Artboard artboard2 = this.activeArtboard;
                if (artboard2 != null) {
                    artboard2.release();
                }
                this.activeArtboard = artboard;
                if (artboard != null) {
                    artboard.acquire();
                }
                Float f10 = this.userSetVolume;
                if (f10 != null) {
                    float fFloatValue = f10.floatValue();
                    Artboard artboard3 = this.activeArtboard;
                    if (artboard3 != null) {
                        artboard3.setVolume$kotlin_release(fFloatValue);
                    }
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAlignment(@NotNull Alignment value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.alignment = value;
        synchronized (this.startStopLock) {
            try {
                Function0<Unit> function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setAutoplay(boolean z10) {
        this.autoplay = z10;
    }

    public final void setBooleanState(@NotNull String stateMachineName, @NotNull String inputName, boolean z10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        queueInput(stateMachineName, inputName, Boolean.valueOf(z10), str);
    }

    public final void setBooleanStateAtPath(@NotNull String inputName, boolean z10, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        queueInput("", inputName, Boolean.valueOf(z10), path);
    }

    public final void setFile(@Nullable File file) {
        Object lock;
        if (Intrinsics.areEqual(file, this.file)) {
            return;
        }
        File file2 = this.file;
        if (file2 == null || (lock = file2.getLock()) == null) {
            lock = this;
        }
        synchronized (lock) {
            try {
                File file3 = this.file;
                if (file3 != null) {
                    reset$kotlin_release();
                    file3.release();
                }
                this.file = file;
                if (file != null) {
                    file.acquire();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setFit(@NotNull Fit value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.fit = value;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            try {
                Function0<Unit> function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setLayoutScaleFactor(@Nullable Float f10) {
        this.layoutScaleFactor = f10;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            try {
                Function0<Unit> function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setLayoutScaleFactorAutomatic$kotlin_release(float f10) {
        this.layoutScaleFactorAutomatic = f10;
        this.requireArtboardResize.set(true);
        synchronized (this.startStopLock) {
            try {
                Function0<Unit> function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setLoop(@NotNull Loop loop) {
        Intrinsics.checkNotNullParameter(loop, "<set-?>");
        this.loop = loop;
    }

    public final void setNumberState(@NotNull String stateMachineName, @NotNull String inputName, float f10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(stateMachineName, "stateMachineName");
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        queueInput(stateMachineName, inputName, Float.valueOf(f10), str);
    }

    public final void setNumberStateAtPath(@NotNull String inputName, float f10, @NotNull String path) {
        Intrinsics.checkNotNullParameter(inputName, "inputName");
        Intrinsics.checkNotNullParameter(path, "path");
        queueInput("", inputName, Float.valueOf(f10), path);
    }

    public final void setOnStart(@Nullable Function0<Unit> function0) {
        this.onStart = function0;
    }

    @Override // app.rive.runtime.kotlin.core.RefCount
    public void setRefs(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<set-?>");
        this.refs = atomicInteger;
    }

    public final void setRequireArtboardResize$kotlin_release(@NotNull AtomicBoolean atomicBoolean) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<set-?>");
        this.requireArtboardResize = atomicBoolean;
    }

    public final void setRiveFile(@NotNull File file, @Nullable String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file, this.file)) {
            return;
        }
        setFile(file);
        selectArtboard(str);
    }

    public final void setTargetBounds(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.targetBounds = rectF;
    }

    public final void setTextRunValue(@NotNull String textRunName, @NotNull String textValue) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(textRunName, textValue);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public final void setVolume(float f10) {
        this.userSetVolume = Float.valueOf(f10);
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setVolume$kotlin_release(f10);
        }
    }

    public final void setupScene$kotlin_release(@NotNull RiveAnimationView.RendererAttributes rendererAttributes) throws ViewModelException, StateMachineException {
        Artboard artboard;
        Intrinsics.checkNotNullParameter(rendererAttributes, "rendererAttributes");
        File file = this.file;
        if (file == null) {
            return;
        }
        reset$kotlin_release();
        this.autoplay = rendererAttributes.getAutoplay();
        setAlignment(rendererAttributes.getAlignment());
        setFit(rendererAttributes.getFit());
        this.loop = rendererAttributes.getLoop();
        String artboardName = rendererAttributes.getArtboardName();
        setActiveArtboard(artboardName != null ? file.artboard(artboardName) : file.getFirstArtboard());
        if (rendererAttributes.getAutoBind() && (artboard = this.activeArtboard) != null) {
            Intrinsics.checkNotNull(artboard);
            ViewModelInstance viewModelInstanceCreateDefaultInstance = file.defaultViewModelForArtboard(artboard).createDefaultInstance();
            artboard.setViewModelInstance(viewModelInstanceCreateDefaultInstance);
            String stateMachineName = rendererAttributes.getStateMachineName();
            if (stateMachineName == null) {
                stateMachineName = (String) CollectionsKt.firstOrNull((List) artboard.getStateMachineNames());
            }
            if (stateMachineName != null) {
                getOrCreateStateMachines(stateMachineName);
            }
            Iterator<T> it = getStateMachines().iterator();
            while (it.hasNext()) {
                ((StateMachineInstance) it.next()).setViewModelInstance(viewModelInstanceCreateDefaultInstance);
            }
        }
        if (this.autoplay) {
            String animationName = rendererAttributes.getAnimationName();
            String stateMachineName2 = rendererAttributes.getStateMachineName();
            if (animationName != null) {
                play$default(this, animationName, (Loop) null, (Direction) null, false, false, 30, (Object) null);
                return;
            } else if (stateMachineName2 != null) {
                play$default(this, stateMachineName2, (Loop) null, (Direction) null, true, true, 6, (Object) null);
                return;
            } else {
                play$default(this, null, null, true, 3, null);
                return;
            }
        }
        Artboard artboard2 = this.activeArtboard;
        if (artboard2 != null) {
            artboard2.advance(0.0f);
        }
        synchronized (this.startStopLock) {
            try {
                Function0<Unit> function0 = this.onStart;
                if (function0 != null) {
                    function0.invoke();
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void stopAnimations() {
        List<LinearAnimationInstance> animationList = this.animationList;
        Intrinsics.checkNotNullExpressionValue(animationList, "animationList");
        if (!animationList.isEmpty()) {
            Iterator<T> it = getAnimations().iterator();
            while (it.hasNext()) {
                stop((LinearAnimationInstance) it.next());
            }
        }
        List<StateMachineInstance> stateMachineList = this.stateMachineList;
        Intrinsics.checkNotNullExpressionValue(stateMachineList, "stateMachineList");
        if (stateMachineList.isEmpty()) {
            return;
        }
        Iterator<T> it2 = getStateMachines().iterator();
        while (it2.hasNext()) {
            stop((StateMachineInstance) it2.next());
        }
    }

    public RiveFileController(@NotNull Loop loop, boolean z10, @Nullable File file, @Nullable Artboard artboard, @Nullable Function0<Unit> function0, @NotNull ConcurrentLinkedQueue<ChangedInput> changedInputs) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(changedInputs, "changedInputs");
        this.loop = loop;
        this.autoplay = z10;
        this.onStart = function0;
        this.changedInputs = changedInputs;
        this.refs = new AtomicInteger(1);
        this.requireArtboardResize = new AtomicBoolean(false);
        this.fit = Fit.CONTAIN;
        this.alignment = Alignment.CENTER;
        this.layoutScaleFactorAutomatic = 1.0f;
        this.file = file;
        this.activeArtboard = artboard;
        this.animationList = Collections.synchronizedList(new ArrayList());
        this.stateMachineList = Collections.synchronizedList(new ArrayList());
        this.playingAnimationSet = Collections.synchronizedSet(new HashSet());
        this.playingStateMachineSet = Collections.synchronizedSet(new HashSet());
        this.startStopLock = new ReentrantLock();
        this.targetBounds = new RectF();
        Set<Listener> setSynchronizedSet = Collections.synchronizedSet(new HashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet, "synchronizedSet(...)");
        this._listeners = setSynchronizedSet;
        Set<RiveEventListener> setSynchronizedSet2 = Collections.synchronizedSet(new HashSet());
        Intrinsics.checkNotNullExpressionValue(setSynchronizedSet2, "synchronizedSet(...)");
        this._eventListeners = setSynchronizedSet2;
    }

    private final List<LinearAnimationInstance> animations(Collection<String> collection) {
        List<LinearAnimationInstance> animations = getAnimations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : animations) {
            if (collection.contains(((LinearAnimationInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void pause$default(RiveFileController riveFileController, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveFileController.pause(str, z10);
    }

    private final List<StateMachineInstance> stateMachines(Collection<String> collection) {
        List<StateMachineInstance> stateMachines = getStateMachines();
        ArrayList arrayList = new ArrayList();
        for (Object obj : stateMachines) {
            if (collection.contains(((StateMachineInstance) obj).getName())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void stopAnimations$default(RiveFileController riveFileController, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        riveFileController.stopAnimations(str, z10);
    }

    @Nullable
    public final String getTextRunValue(@NotNull String textRunName, @NotNull String path) {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(path, "path");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            return artboard.getTextRunValue(textRunName, path);
        }
        return null;
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void registerListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.startStopLock) {
            this._listeners.add(listener);
        }
    }

    @Override // app.rive.runtime.kotlin.Observable
    public void unregisterListener(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.startStopLock) {
            this._listeners.remove(listener);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, String str, Loop loop, Direction direction, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            loop = Loop.AUTO;
        }
        Loop loop2 = loop;
        if ((i10 & 4) != 0) {
            direction = Direction.AUTO;
        }
        Direction direction2 = direction;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        riveFileController.play(str, loop2, direction2, z12, z11);
    }

    private final void stop(StateMachineInstance stateMachineInstance) {
        this.playingStateMachineSet.remove(stateMachineInstance);
        if (this.stateMachineList.remove(stateMachineInstance)) {
            notifyStop(stateMachineInstance);
        }
    }

    public final void play(@NotNull String animationName, @NotNull Loop loop, @NotNull Direction direction, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        playAnimation(animationName, loop, direction, z10, z11);
    }

    public final void play(@NotNull Loop loop, @NotNull Direction direction, boolean z10) {
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            if (getPausedAnimations().isEmpty() && getPausedStateMachines().isEmpty()) {
                List<String> animationNames = artboard.getAnimationNames();
                if (!animationNames.isEmpty()) {
                    int i10 = 4 >> 0;
                    playAnimation$default(this, (String) CollectionsKt.first((List) animationNames), loop, direction, false, false, 24, null);
                }
                List<String> stateMachineNames = artboard.getStateMachineNames();
                if (stateMachineNames.isEmpty()) {
                    return;
                }
                playAnimation((String) CollectionsKt.first((List) stateMachineNames), loop, direction, true, z10);
                return;
            }
            Iterator<T> it = getAnimations().iterator();
            while (it.hasNext()) {
                play$kotlin_release((LinearAnimationInstance) it.next(), loop, direction);
            }
            Iterator<T> it2 = getStateMachines().iterator();
            while (it2.hasNext()) {
                play$kotlin_release((StateMachineInstance) it2.next(), z10);
            }
        }
    }

    public final void setTextRunValue(@NotNull String textRunName, @NotNull String textValue, @NotNull String path) throws TextValueRunException {
        Intrinsics.checkNotNullParameter(textRunName, "textRunName");
        Intrinsics.checkNotNullParameter(textValue, "textValue");
        Intrinsics.checkNotNullParameter(path, "path");
        Artboard artboard = this.activeArtboard;
        if (artboard != null) {
            artboard.setTextRunValue(textRunName, textValue, path);
        }
        Iterator<T> it = getStateMachines().iterator();
        while (it.hasNext()) {
            play$kotlin_release((StateMachineInstance) it.next(), false);
        }
    }

    public static /* synthetic */ void play$default(RiveFileController riveFileController, Loop loop, Direction direction, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            loop = Loop.AUTO;
        }
        if ((i10 & 2) != 0) {
            direction = Direction.AUTO;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        riveFileController.play(loop, direction, z10);
    }

    public final void pause(@NotNull List<String> animationNames, boolean z10) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        if (z10) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(@NotNull List<String> animationNames, boolean z10) {
        Intrinsics.checkNotNullParameter(animationNames, "animationNames");
        if (z10) {
            Iterator<T> it = stateMachines(animationNames).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationNames).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void play$kotlin_release(@NotNull LinearAnimationInstance animationInstance, @NotNull Loop loop, @NotNull Direction direction) {
        Intrinsics.checkNotNullParameter(animationInstance, "animationInstance");
        Intrinsics.checkNotNullParameter(loop, "loop");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Loop loop2 = Loop.AUTO;
        if (loop == loop2) {
            loop = this.loop;
        }
        if (loop != loop2) {
            animationInstance.setLoop(loop);
        }
        if (!this.animationList.contains(animationInstance)) {
            if (direction == Direction.BACKWARDS) {
                animationInstance.time(animationInstance.getEndTime());
            }
            this.animationList.add(animationInstance);
        }
        if (direction != Direction.AUTO) {
            animationInstance.setDirection(direction);
        }
        synchronized (this.startStopLock) {
            this.playingAnimationSet.add(animationInstance);
            Function0<Unit> function0 = this.onStart;
            if (function0 != null) {
                function0.invoke();
                Unit unit = Unit.f312394a;
            }
        }
        notifyPlay(animationInstance);
    }

    public final void pause(@NotNull String animationName, boolean z10) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        if (z10) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                pause((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                pause((LinearAnimationInstance) it2.next());
            }
        }
    }

    public final void stopAnimations(@NotNull String animationName, boolean z10) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        if (z10) {
            Iterator<T> it = stateMachines(animationName).iterator();
            while (it.hasNext()) {
                stop((StateMachineInstance) it.next());
            }
        } else {
            Iterator<T> it2 = animations(animationName).iterator();
            while (it2.hasNext()) {
                stop((LinearAnimationInstance) it2.next());
            }
        }
    }

    private final void pause(LinearAnimationInstance linearAnimationInstance) {
        if (this.playingAnimationSet.remove(linearAnimationInstance)) {
            notifyPause(linearAnimationInstance);
        }
    }

    private final void pause(StateMachineInstance stateMachineInstance) {
        if (this.playingStateMachineSet.remove(stateMachineInstance)) {
            notifyPause(stateMachineInstance);
        }
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z10, File file, Artboard artboard, Function0 function0, ConcurrentLinkedQueue concurrentLinkedQueue, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Loop.AUTO : loop, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : file, (i10 & 8) != 0 ? null : artboard, (i10 & 16) != 0 ? null : function0, (i10 & 32) != 0 ? new ConcurrentLinkedQueue() : concurrentLinkedQueue);
    }

    public /* synthetic */ RiveFileController(Loop loop, boolean z10, File file, Artboard artboard, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Loop.AUTO : loop, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : file, (i10 & 8) != 0 ? null : artboard, (i10 & 16) != 0 ? null : function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RiveFileController(@NotNull Loop loop, boolean z10, @Nullable File file, @Nullable Artboard artboard, @Nullable Function0<Unit> function0) {
        this(loop, z10, file, artboard, function0, new ConcurrentLinkedQueue());
        Intrinsics.checkNotNullParameter(loop, "loop");
    }
}
