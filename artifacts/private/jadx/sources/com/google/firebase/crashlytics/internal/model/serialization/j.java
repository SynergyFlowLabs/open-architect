package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.model.f0;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.encoders.a f121726a = new com.google.firebase.encoders.json.e().k(com.google.firebase.crashlytics.internal.model.a.f121346b).l(true).j();

    /* JADX INFO: Access modifiers changed from: private */
    interface a<T> {
        T a(@NonNull JsonReader jsonReader) throws IOException;
    }

    @NonNull
    private static f0.f.d.AbstractC1144d A(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.AbstractC1144d.a aVarA = f0.f.d.AbstractC1144d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(FirebaseAnalytics.d.P)) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.f.d.e B(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.e.a aVarA = f0.f.d.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarA.e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarA.d(K(jsonReader));
                    break;
                case "parameterValue":
                    aVarA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f.d.AbstractC1145f C(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.AbstractC1145f.a aVarA = f0.f.d.AbstractC1145f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("assignments")) {
                aVarA.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.i
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.B(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f.d.a.b.AbstractC1138d D(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.AbstractC1138d.AbstractC1139a abstractC1139aA = f0.f.d.a.b.AbstractC1138d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC1139aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC1139aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC1139aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1139aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.f.d.a.b.e E(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.e.AbstractC1140a abstractC1140aA = f0.f.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC1140aA.b(p(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case "name":
                    abstractC1140aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC1140aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1140aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.e.b F(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.b.a aVarA = f0.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.e G(@NonNull JsonReader jsonReader) throws IOException {
        f0.e.a aVarA = f0.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarA.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.h
                    @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                    public final Object a(JsonReader jsonReader2) {
                        return j.F(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f.e H(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.e.a aVarA = f0.f.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.f.d.a.c I(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.c.AbstractC1143a abstractC1143aA = f0.f.d.a.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC1143aA.d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC1143aA.e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC1143aA.b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC1143aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1143aA.a();
    }

    @NonNull
    private static f0 J(@NonNull JsonReader jsonReader) throws IOException {
        f0.c cVarB = f0.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    cVarB.j(G(jsonReader));
                    break;
                case "sdkVersion":
                    cVarB.l(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    cVarB.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    cVarB.b(o(jsonReader));
                    break;
                case "buildVersion":
                    cVarB.d(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    cVarB.f(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    cVarB.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    cVarB.i(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    cVarB.g(jsonReader.nextString());
                    break;
                case "platform":
                    cVarB.k(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    cVarB.e(jsonReader.nextString());
                    break;
                case "session":
                    cVarB.m(L(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return cVarB.a();
    }

    @NonNull
    private static f0.f.d.e.b K(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.e.b.a aVarA = f0.f.d.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("variantId")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals(com.google.firebase.remoteconfig.internal.h.f124535o)) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f L(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.b bVarA = f0.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarA.c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarA.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.e(s(jsonReader));
                    break;
                case "events":
                    bVarA.g(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.e
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.t(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.l(H(jsonReader));
                    break;
                case "app":
                    bVarA.b(n(jsonReader));
                    break;
                case "user":
                    bVarA.n(M(jsonReader));
                    break;
                case "generator":
                    bVarA.h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @NonNull
    private static f0.f.AbstractC1146f M(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.AbstractC1146f.a aVarA = f0.f.AbstractC1146f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f.a n(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.a.AbstractC1131a abstractC1131aA = f0.f.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC1131aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC1131aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC1131aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC1131aA.h(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC1131aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC1131aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1131aA.a();
    }

    @NonNull
    private static f0.a o(@NonNull JsonReader jsonReader) throws IOException {
        f0.a.b bVarA = f0.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.b
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.q(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @NonNull
    private static <T> List<T> p(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.a.AbstractC1129a q(@NonNull JsonReader jsonReader) throws IOException {
        f0.a.AbstractC1129a.AbstractC1130a abstractC1130aA = f0.a.AbstractC1129a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC1130aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC1130aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC1130aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1130aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.d r(@NonNull JsonReader jsonReader) throws IOException {
        f0.d.a aVarA = f0.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f.c s(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.c.a aVarA = f0.f.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.f.d t(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.b bVarA = f0.f.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarA.c(w(jsonReader));
                    break;
                case "rollouts":
                    bVarA.e(C(jsonReader));
                    break;
                case "app":
                    bVarA.b(u(jsonReader));
                    break;
                case "log":
                    bVarA.d(A(jsonReader));
                    break;
                case "type":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    @NonNull
    private static f0.f.d.a u(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.AbstractC1133a abstractC1133aA = f0.f.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC1133aA.b(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.d
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.I(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC1133aA.c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC1133aA.f(x(jsonReader));
                    break;
                case "internalKeys":
                    abstractC1133aA.g(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC1133aA.e(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.c
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.r(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC1133aA.h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC1133aA.d(I(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1133aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.f.d.a.b.AbstractC1134a v(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.AbstractC1134a.AbstractC1135a abstractC1135aA = f0.f.d.a.b.AbstractC1134a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC1135aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC1135aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC1135aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC1135aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1135aA.a();
    }

    @NonNull
    private static f0.f.d.c w(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.c.a aVarA = f0.f.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    @NonNull
    private static f0.f.d.a.b x(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.AbstractC1136b abstractC1136bA = f0.f.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC1136bA.b(o(jsonReader));
                    break;
                case "threads":
                    abstractC1136bA.f(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.f
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.E(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC1136bA.e(D(jsonReader));
                    break;
                case "binaries":
                    abstractC1136bA.c(p(jsonReader, new a() { // from class: com.google.firebase.crashlytics.internal.model.serialization.g
                        @Override // com.google.firebase.crashlytics.internal.model.serialization.j.a
                        public final Object a(JsonReader jsonReader2) {
                            return j.v(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC1136bA.d(y(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1136bA.a();
    }

    @NonNull
    private static f0.f.d.a.b.c y(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.c.AbstractC1137a abstractC1137aA = f0.f.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC1137aA.c(p(jsonReader, new com.google.firebase.crashlytics.internal.model.serialization.a()));
                    break;
                case "reason":
                    abstractC1137aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC1137aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC1137aA.b(y(jsonReader));
                    break;
                case "overflowCount":
                    abstractC1137aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1137aA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static f0.f.d.a.b.e.AbstractC1141b z(@NonNull JsonReader jsonReader) throws IOException {
        f0.f.d.a.b.e.AbstractC1141b.AbstractC1142a abstractC1142aA = f0.f.d.a.b.e.AbstractC1141b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC1142aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC1142aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC1142aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC1142aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC1142aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1142aA.a();
    }

    @NonNull
    public f0 N(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0 f0VarJ = J(jsonReader);
                jsonReader.close();
                return f0VarJ;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public String O(@NonNull f0 f0Var) {
        return f121726a.a(f0Var);
    }

    @NonNull
    public f0.a j(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0.a aVarO = o(jsonReader);
                jsonReader.close();
                return aVarO;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public String k(@NonNull f0.a aVar) {
        return f121726a.a(aVar);
    }

    @NonNull
    public f0.f.d l(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                f0.f.d dVarT = t(jsonReader);
                jsonReader.close();
                return dVarT;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public String m(@NonNull f0.f.d dVar) {
        return f121726a.a(dVar);
    }
}
