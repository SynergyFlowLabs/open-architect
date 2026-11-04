package com.superwall.sdk.game;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class GameControllerEvent {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private String controllerElement;
    private boolean directional;

    @NotNull
    private String eventName;
    private double value;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private double f267435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private double f267436y;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<GameControllerEvent> serializer() {
            return GameControllerEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GameControllerEvent(int i10, String str, String str2, double d10, double d11, double d12, boolean z10, v2 v2Var) {
        if (62 != (i10 & 62)) {
            g2.b(i10, 62, GameControllerEvent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.eventName = "game_controller_input";
        } else {
            this.eventName = str;
        }
        this.controllerElement = str2;
        this.value = d10;
        this.f267435x = d11;
        this.f267436y = d12;
        this.directional = z10;
    }

    public static /* synthetic */ GameControllerEvent copy$default(GameControllerEvent gameControllerEvent, String str, String str2, double d10, double d11, double d12, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gameControllerEvent.eventName;
        }
        if ((i10 & 2) != 0) {
            str2 = gameControllerEvent.controllerElement;
        }
        if ((i10 & 4) != 0) {
            d10 = gameControllerEvent.value;
        }
        if ((i10 & 8) != 0) {
            d11 = gameControllerEvent.f267435x;
        }
        if ((i10 & 16) != 0) {
            d12 = gameControllerEvent.f267436y;
        }
        if ((i10 & 32) != 0) {
            z10 = gameControllerEvent.directional;
        }
        boolean z11 = z10;
        double d13 = d12;
        double d14 = d11;
        return gameControllerEvent.copy(str, str2, d10, d14, d13, z11);
    }

    @a0("controller_element")
    public static /* synthetic */ void getControllerElement$annotations() {
    }

    @a0("directional")
    public static /* synthetic */ void getDirectional$annotations() {
    }

    @a0("event_name")
    public static /* synthetic */ void getEventName$annotations() {
    }

    @a0("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    @a0("x")
    public static /* synthetic */ void getX$annotations() {
    }

    @a0("y")
    public static /* synthetic */ void getY$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(GameControllerEvent gameControllerEvent, e eVar, SerialDescriptor serialDescriptor) {
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.areEqual(gameControllerEvent.eventName, "game_controller_input")) {
            eVar.encodeStringElement(serialDescriptor, 0, gameControllerEvent.eventName);
        }
        eVar.encodeStringElement(serialDescriptor, 1, gameControllerEvent.controllerElement);
        eVar.encodeDoubleElement(serialDescriptor, 2, gameControllerEvent.value);
        eVar.encodeDoubleElement(serialDescriptor, 3, gameControllerEvent.f267435x);
        eVar.encodeDoubleElement(serialDescriptor, 4, gameControllerEvent.f267436y);
        int i10 = 0 | 5;
        eVar.encodeBooleanElement(serialDescriptor, 5, gameControllerEvent.directional);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final String component2() {
        return this.controllerElement;
    }

    public final double component3() {
        return this.value;
    }

    public final double component4() {
        return this.f267435x;
    }

    public final double component5() {
        return this.f267436y;
    }

    public final boolean component6() {
        return this.directional;
    }

    @NotNull
    public final GameControllerEvent copy(@NotNull String eventName, @NotNull String controllerElement, double d10, double d11, double d12, boolean z10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(controllerElement, "controllerElement");
        return new GameControllerEvent(eventName, controllerElement, d10, d11, d12, z10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameControllerEvent)) {
            return false;
        }
        GameControllerEvent gameControllerEvent = (GameControllerEvent) obj;
        return Intrinsics.areEqual(this.eventName, gameControllerEvent.eventName) && Intrinsics.areEqual(this.controllerElement, gameControllerEvent.controllerElement) && Double.compare(this.value, gameControllerEvent.value) == 0 && Double.compare(this.f267435x, gameControllerEvent.f267435x) == 0 && Double.compare(this.f267436y, gameControllerEvent.f267436y) == 0 && this.directional == gameControllerEvent.directional;
    }

    @NotNull
    public final String getControllerElement() {
        return this.controllerElement;
    }

    public final boolean getDirectional() {
        return this.directional;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final double getValue() {
        return this.value;
    }

    public final double getX() {
        return this.f267435x;
    }

    public final double getY() {
        return this.f267436y;
    }

    public int hashCode() {
        return (((((((((this.eventName.hashCode() * 31) + this.controllerElement.hashCode()) * 31) + Double.hashCode(this.value)) * 31) + Double.hashCode(this.f267435x)) * 31) + Double.hashCode(this.f267436y)) * 31) + Boolean.hashCode(this.directional);
    }

    public final void setControllerElement(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.controllerElement = str;
    }

    public final void setDirectional(boolean z10) {
        this.directional = z10;
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setValue(double d10) {
        this.value = d10;
    }

    public final void setX(double d10) {
        this.f267435x = d10;
    }

    public final void setY(double d10) {
        this.f267436y = d10;
    }

    @NotNull
    public String toString() {
        return "GameControllerEvent(eventName=" + this.eventName + ", controllerElement=" + this.controllerElement + ", value=" + this.value + ", x=" + this.f267435x + ", y=" + this.f267436y + ", directional=" + this.directional + ")";
    }

    public GameControllerEvent(@NotNull String eventName, @NotNull String controllerElement, double d10, double d11, double d12, boolean z10) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(controllerElement, "controllerElement");
        this.eventName = eventName;
        this.controllerElement = controllerElement;
        this.value = d10;
        this.f267435x = d11;
        this.f267436y = d12;
        this.directional = z10;
    }

    public /* synthetic */ GameControllerEvent(String str, String str2, double d10, double d11, double d12, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "game_controller_input" : str, str2, d10, d11, d12, z10);
    }
}
