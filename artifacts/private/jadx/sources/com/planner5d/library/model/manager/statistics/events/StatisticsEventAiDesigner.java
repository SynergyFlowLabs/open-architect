package com.planner5d.library.model.manager.statistics.events;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface StatisticsEventAiDesigner {

    @gk.d
    public static final class EventData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<EventData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final d f216630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final g f216631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Integer f216632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final Integer f216633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final Integer f216634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private final e f216635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private final String f216636g;

        public static final class a implements Parcelable.Creator<EventData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EventData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EventData(parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? e.valueOf(parcel.readString()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final EventData[] newArray(int i10) {
                return new EventData[i10];
            }
        }

        public EventData() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ EventData j(EventData eventData, d dVar, g gVar, Integer num, Integer num2, Integer num3, e eVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                dVar = eventData.f216630a;
            }
            if ((i10 & 2) != 0) {
                gVar = eventData.f216631b;
            }
            if ((i10 & 4) != 0) {
                num = eventData.f216632c;
            }
            if ((i10 & 8) != 0) {
                num2 = eventData.f216633d;
            }
            if ((i10 & 16) != 0) {
                num3 = eventData.f216634e;
            }
            if ((i10 & 32) != 0) {
                eVar = eventData.f216635f;
            }
            if ((i10 & 64) != 0) {
                str = eventData.f216636g;
            }
            e eVar2 = eVar;
            String str2 = str;
            Integer num4 = num3;
            Integer num5 = num;
            return eventData.i(dVar, gVar, num5, num2, num4, eVar2, str2);
        }

        @Nullable
        public final d a() {
            return this.f216630a;
        }

        @Nullable
        public final g b() {
            return this.f216631b;
        }

        @Nullable
        public final Integer c() {
            return this.f216632c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Integer e() {
            return this.f216633d;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventData)) {
                return false;
            }
            EventData eventData = (EventData) obj;
            return this.f216630a == eventData.f216630a && this.f216631b == eventData.f216631b && Intrinsics.areEqual(this.f216632c, eventData.f216632c) && Intrinsics.areEqual(this.f216633d, eventData.f216633d) && Intrinsics.areEqual(this.f216634e, eventData.f216634e) && this.f216635f == eventData.f216635f && Intrinsics.areEqual(this.f216636g, eventData.f216636g);
        }

        @Nullable
        public final Integer f() {
            return this.f216634e;
        }

        @Nullable
        public final e g() {
            return this.f216635f;
        }

        @Nullable
        public final String h() {
            return this.f216636g;
        }

        public int hashCode() {
            d dVar = this.f216630a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            g gVar = this.f216631b;
            int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
            Integer num = this.f216632c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f216633d;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f216634e;
            int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            e eVar = this.f216635f;
            int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            String str = this.f216636g;
            return iHashCode6 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final EventData i(@Nullable d dVar, @Nullable g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable e eVar, @Nullable String str) {
            return new EventData(dVar, gVar, num, num2, num3, eVar, str);
        }

        @Nullable
        public final String k() {
            return this.f216636g;
        }

        @Nullable
        public final d l() {
            return this.f216630a;
        }

        @Nullable
        public final e m() {
            return this.f216635f;
        }

        @Nullable
        public final Integer n() {
            return this.f216633d;
        }

        @Nullable
        public final Integer o() {
            return this.f216632c;
        }

        @Nullable
        public final Integer p() {
            return this.f216634e;
        }

        @Nullable
        public final g q() {
            return this.f216631b;
        }

        @NotNull
        public String toString() {
            return "EventData(entryPoint=" + this.f216630a + ", toolName=" + this.f216631b + ", roomType=" + this.f216632c + ", roomStyle=" + this.f216633d + ", score=" + this.f216634e + ", errorType=" + this.f216635f + ", decorElements=" + this.f216636g + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            d dVar = this.f216630a;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            g gVar = this.f216631b;
            if (gVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(gVar.name());
            }
            Integer num = this.f216632c;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Integer num2 = this.f216633d;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            Integer num3 = this.f216634e;
            if (num3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num3.intValue());
            }
            e eVar = this.f216635f;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(eVar.name());
            }
            dest.writeString(this.f216636g);
        }

        public EventData(@Nullable d dVar, @Nullable g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable e eVar, @Nullable String str) {
            this.f216630a = dVar;
            this.f216631b = gVar;
            this.f216632c = num;
            this.f216633d = num2;
            this.f216634e = num3;
            this.f216635f = eVar;
            this.f216636g = str;
        }

        public /* synthetic */ EventData(d dVar, g gVar, Integer num, Integer num2, Integer num3, e eVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : dVar, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : num3, (i10 & 32) != 0 ? null : eVar, (i10 & 64) != 0 ? null : str);
        }
    }

    public enum b {
        ai_designer_button;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216658c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<b> l() {
            return f216658c;
        }
    }

    public static final class c {
        public static /* synthetic */ void a(StatisticsEventAiDesigner statisticsEventAiDesigner, a aVar, d dVar, g gVar, Integer num, Integer num2, Integer num3, e eVar, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: action");
            }
            if ((i10 & 4) != 0) {
                gVar = null;
            }
            if ((i10 & 8) != 0) {
                num = null;
            }
            if ((i10 & 16) != 0) {
                num2 = null;
            }
            if ((i10 & 32) != 0) {
                num3 = null;
            }
            if ((i10 & 64) != 0) {
                eVar = null;
            }
            if ((i10 & 128) != 0) {
                str = null;
            }
            statisticsEventAiDesigner.F0(aVar, dVar, gVar, num, num2, num3, eVar, str);
        }
    }

    public enum d {
        action_bar,
        toolbar;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216662d = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f216662d;
        }
    }

    public enum e {
        unexpected;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216665c = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<e> l() {
            return f216665c;
        }
    }

    public enum f {
        choose_a_room_alert;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216668c = kotlin.enums.c.c(k());

        static {
            boolean z10 = false | false;
        }

        @NotNull
        public static kotlin.enums.a<f> l() {
            return f216668c;
        }
    }

    void F0(@NotNull a aVar, @Nullable d dVar, @Nullable g gVar, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable e eVar, @Nullable String str);

    void i(@NotNull a aVar, @NotNull EventData eventData);

    public enum a {
        open,
        close,
        next,
        back,
        tool_selected,
        onboarding_completed("onboarding_complited"),
        completed,
        variant_ready,
        variant_updated,
        error,
        rate_us_open,
        score_submitted,
        form_submitted,
        button_view,
        button_click,
        popup_view,
        decorate,
        refresh,
        save;

        private static final /* synthetic */ kotlin.enums.a Z = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f216655a;

        a(String str) {
            this.f216655a = str == null ? name() : str;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return Z;
        }

        a() {
            this(null);
        }
    }

    public enum g {
        furnisher("furnished"),
        styler,
        decorator;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f216673f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final String f216674a;

        g(String str) {
            this.f216674a = str == null ? name() : str;
        }

        @NotNull
        public static kotlin.enums.a<g> l() {
            return f216673f;
        }

        g() {
            this(null);
        }
    }
}
