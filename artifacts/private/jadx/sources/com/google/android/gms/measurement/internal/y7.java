package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.sg;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class y7 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbg f110722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f110724c;

    y7(j8 j8Var, zzbg zzbgVar, String str) {
        this.f110722a = zzbgVar;
        this.f110723b = str;
        Objects.requireNonNull(j8Var);
        this.f110724c = j8Var;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0469 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x047f A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x048a A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x048e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0490 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x04a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01be A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f7 A[Catch: all -> 0x007b, SecurityException -> 0x0215, TryCatch #0 {SecurityException -> 0x0215, blocks: (B:60:0x01ef, B:62:0x01f7, B:64:0x01fd), top: B:127:0x01ef, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0223 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0248 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0260 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0264 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0294 A[Catch: all -> 0x007b, LOOP:1: B:85:0x028e->B:87:0x0294, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0334 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0354 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x03a0 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0407 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x0172, B:51:0x017c, B:52:0x018d, B:54:0x0191, B:56:0x019c, B:59:0x01be, B:60:0x01ef, B:62:0x01f7, B:64:0x01fd, B:68:0x0219, B:70:0x0223, B:71:0x0230, B:72:0x0242, B:74:0x0248, B:81:0x0260, B:84:0x0287, B:85:0x028e, B:87:0x0294, B:88:0x02c8, B:90:0x0334, B:91:0x0348, B:93:0x0354, B:95:0x03c3, B:96:0x0401, B:98:0x0407, B:100:0x0418, B:101:0x0423, B:103:0x0469, B:104:0x0477, B:106:0x047f, B:107:0x0482, B:109:0x048a, B:112:0x0493, B:115:0x04a8, B:116:0x04ab, B:111:0x0490, B:94:0x03a0, B:83:0x0264, B:122:0x052c), top: B:133:0x0057, inners: #0, #2 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        qe qeVar;
        String strO0;
        qe qeVar2;
        List listC0;
        Iterator it;
        xe xeVar;
        com.google.android.gms.internal.measurement.b8[] b8VarArr;
        int i10;
        h7 h7Var;
        Bundle bundle;
        String str;
        String str2;
        b0 b0VarV0;
        com.google.android.gms.internal.measurement.f7 f7Var;
        com.google.android.gms.internal.measurement.j7 j7Var;
        c6 c6Var;
        String str3;
        Bundle bundle2;
        Object obj;
        b0 b0VarA;
        long j10;
        com.google.android.gms.internal.measurement.j7 j7Var2;
        com.google.android.gms.internal.measurement.x6 x6VarO;
        zzbe zzbeVar;
        c0 c0Var;
        long jB0;
        long jZ0;
        String strT0;
        com.google.android.gms.internal.measurement.b7 b7VarQ;
        Object objO1;
        byte[] bArr2;
        j8 j8Var = this.f110724c;
        j8Var.L().E();
        za zaVarJ0 = j8Var.L().J0();
        zaVarJ0.h();
        h7 h7Var2 = zaVarJ0.f110184a;
        h7.q();
        zzbg zzbgVar = this.f110722a;
        com.google.android.gms.common.internal.w.r(zzbgVar);
        String str4 = this.f110723b;
        com.google.android.gms.common.internal.w.l(str4);
        String str5 = zzbgVar.f110858a;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            zaVarJ0.f110184a.a().v().c("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        qe qeVar3 = zaVarJ0.f110700b;
        com.google.android.gms.internal.measurement.f7 f7VarL = com.google.android.gms.internal.measurement.i7.L();
        qeVar3.F0().r0();
        try {
            c6 c6VarJ0 = qeVar3.F0().J0(str4);
            if (c6VarJ0 == null) {
                zaVarJ0.f110184a.a().v().b("Log and bundle not available. package_name", str4);
                bArr2 = new byte[0];
            } else {
                if (c6VarJ0.d()) {
                    com.google.android.gms.internal.measurement.j7 j7VarJ0 = com.google.android.gms.internal.measurement.k7.j0();
                    j7VarJ0.W(1);
                    j7VarJ0.w("android");
                    if (!TextUtils.isEmpty(c6VarJ0.o0())) {
                        j7VarJ0.G(c6VarJ0.o0());
                    }
                    if (!TextUtils.isEmpty(c6VarJ0.H0())) {
                        j7VarJ0.E((String) com.google.android.gms.common.internal.w.r(c6VarJ0.H0()));
                    }
                    if (!TextUtils.isEmpty(c6VarJ0.D0())) {
                        j7VarJ0.H((String) com.google.android.gms.common.internal.w.r(c6VarJ0.D0()));
                    }
                    if (c6VarJ0.F0() != androidx.collection.g3.f12261h) {
                        j7VarJ0.x0((int) c6VarJ0.F0());
                    }
                    j7VarJ0.I(c6VarJ0.J0());
                    j7VarJ0.F0(c6VarJ0.b());
                    String strR0 = c6VarJ0.r0();
                    if (!TextUtils.isEmpty(strR0)) {
                        j7VarJ0.r0(strR0);
                    }
                    j7VarJ0.M0(c6VarJ0.X());
                    r8 r8VarG = zaVarJ0.f110700b.g(str4);
                    j7VarJ0.U(c6VarJ0.L0());
                    if (h7Var2.g() && zaVarJ0.f110184a.w().k(j7VarJ0.F()) && r8VarG.o(q8.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        j7VarJ0.A0(null);
                    }
                    j7VarJ0.H0(r8VarG.k());
                    if (r8VarG.o(q8.AD_STORAGE) && c6VarJ0.P()) {
                        Pair pairM = qeVar3.L0().m(c6VarJ0.o0(), r8VarG);
                        if (!c6VarJ0.P() || TextUtils.isEmpty((CharSequence) pairM.first)) {
                            h7 h7Var3 = zaVarJ0.f110184a;
                            h7Var3.K().l();
                            j7VarJ0.A(Build.MODEL);
                            h7Var3.K().l();
                            j7VarJ0.z(Build.VERSION.RELEASE);
                            j7VarJ0.D((int) h7Var3.K().o());
                            j7VarJ0.C(h7Var3.K().p());
                            if (r8VarG.o(q8.ANALYTICS_STORAGE)) {
                                j7VarJ0.S(za.m((String) com.google.android.gms.common.internal.w.r(c6VarJ0.p0()), Long.toString(zzbgVar.f110861d)));
                            }
                            if (!TextUtils.isEmpty(c6VarJ0.x0())) {
                                j7VarJ0.v0((String) com.google.android.gms.common.internal.w.r(c6VarJ0.x0()));
                            }
                            strO0 = c6VarJ0.o0();
                            qeVar2 = zaVarJ0.f110700b;
                            listC0 = qeVar2.F0().C0(strO0);
                            it = listC0.iterator();
                            do {
                                if (!it.hasNext()) {
                                    xeVar = null;
                                    break;
                                }
                                xeVar = (xe) it.next();
                            } while (!"_lte".equals(xeVar.f110703c));
                            if (xeVar != null) {
                                xe xeVar2 = new xe(strO0, "auto", "_lte", zaVarJ0.f110184a.e().currentTimeMillis(), 0L);
                                listC0.add(xeVar2);
                                qeVar2.F0().A0(xeVar2);
                            } else {
                                xe xeVar3 = new xe(strO0, "auto", "_lte", zaVarJ0.f110184a.e().currentTimeMillis(), 0L);
                                listC0.add(xeVar3);
                                qeVar2.F0().A0(xeVar3);
                            }
                            b8VarArr = new com.google.android.gms.internal.measurement.b8[listC0.size()];
                            for (i10 = 0; i10 < listC0.size(); i10++) {
                                com.google.android.gms.internal.measurement.a8 a8VarP = com.google.android.gms.internal.measurement.b8.P();
                                a8VarP.v(((xe) listC0.get(i10)).f110703c);
                                a8VarP.u(((xe) listC0.get(i10)).f110704d);
                                qeVar2.K0().G(a8VarP, ((xe) listC0.get(i10)).f110705e);
                                b8VarArr[i10] = (com.google.android.gms.internal.measurement.b8) a8VarP.r();
                            }
                            j7VarJ0.d1(Arrays.asList(b8VarArr));
                            qe qeVar4 = zaVarJ0.f110700b;
                            qeVar4.n(c6VarJ0, j7VarJ0);
                            qeVar4.o(c6VarJ0, j7VarJ0);
                            x5 x5VarA = x5.a(zzbgVar);
                            h7Var = zaVarJ0.f110184a;
                            ze zeVarC = h7Var.C();
                            bundle = x5VarA.f110667d;
                            zeVarC.w(bundle, qeVar2.F0().G(str4));
                            h7Var.C().u(x5VarA, h7Var.w().w(str4));
                            bundle.putLong("_c", 1L);
                            h7Var.a().v().a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.f110860c;
                            bundle.putString("_o", str);
                            if (h7Var.C().P(j7VarJ0.F(), c6VarJ0.l0())) {
                                h7Var.C().A(bundle, "_dbg", 1L);
                                h7Var.C().A(bundle, "_r", 1L);
                            }
                            t tVarF0 = qeVar2.F0();
                            str2 = zzbgVar.f110858a;
                            b0VarV0 = tVarF0.v0(str4, str2);
                            if (b0VarV0 == null) {
                                c6Var = c6VarJ0;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                j7Var = j7VarJ0;
                                b0VarA = new b0(str4, str2, 0L, 0L, 0L, zzbgVar.f110861d, 0L, null, null, null, null);
                                j10 = 0;
                                f7Var = f7VarL;
                            } else {
                                f7Var = f7VarL;
                                j7Var = j7VarJ0;
                                c6Var = c6VarJ0;
                                str3 = str;
                                bundle2 = bundle;
                                obj = null;
                                long j11 = b0VarV0.f109769f;
                                b0VarA = b0VarV0.a(zzbgVar.f110861d);
                                j10 = j11;
                            }
                            qeVar2.F0().w0(b0VarA);
                            j7Var2 = j7Var;
                            h7 h7Var4 = zaVarJ0.f110184a;
                            long j12 = zzbgVar.f110861d;
                            c6 c6Var2 = c6Var;
                            a0 a0Var = new a0(h7Var4, str3, str4, str2, j12, j10, bundle2);
                            x6VarO = com.google.android.gms.internal.measurement.y6.O();
                            x6VarO.J(a0Var.f109733d);
                            x6VarO.G(a0Var.f109731b);
                            x6VarO.L(a0Var.f109734e);
                            zzbeVar = a0Var.f109735f;
                            c0Var = new c0(zzbeVar);
                            while (c0Var.hasNext()) {
                                String next = c0Var.next();
                                b7VarQ = com.google.android.gms.internal.measurement.c7.Q();
                                b7VarQ.v(next);
                                objO1 = zzbeVar.O1(next);
                                if (objO1 != null) {
                                    qeVar2.K0().H(b7VarQ, objO1);
                                    x6VarO.B(b7VarQ);
                                }
                            }
                            j7Var2.T0(x6VarO);
                            com.google.android.gms.internal.measurement.l7 l7VarE = com.google.android.gms.internal.measurement.n7.E();
                            com.google.android.gms.internal.measurement.z6 z6VarE = com.google.android.gms.internal.measurement.a7.E();
                            z6VarE.v(b0VarA.f109766c);
                            z6VarE.u(str2);
                            l7VarE.u(z6VarE);
                            j7Var2.D0(l7VarE);
                            j7Var2.t0(qeVar2.I0().m(c6Var2.o0(), Collections.EMPTY_LIST, j7Var2.X0(), Long.valueOf(x6VarO.I()), Long.valueOf(x6VarO.I()), false));
                            if (x6VarO.H()) {
                                j7Var2.i1(x6VarO.I());
                                j7Var2.k1(x6VarO.I());
                            }
                            jB0 = c6Var2.B0();
                            if (jB0 != 0) {
                                j7Var2.u(jB0);
                            }
                            jZ0 = c6Var2.z0();
                            if (jZ0 != 0) {
                                j7Var2.l1(jZ0);
                            } else if (jB0 != 0) {
                                j7Var2.l1(jB0);
                            }
                            strT0 = c6Var2.t0();
                            sg.a();
                            if (h7Var.w().H(str4, z4.N0)) {
                                j7Var2.I0(strT0);
                            }
                            c6Var2.l();
                            j7Var2.V((int) c6Var2.g());
                            h7Var.w().A();
                            j7Var2.J(133005L);
                            j7Var2.f1(h7Var.e().currentTimeMillis());
                            j7Var2.s0(true);
                            qeVar4.x(j7Var2.F(), j7Var2);
                            f7Var.z(j7Var2);
                            c6Var2.A0(j7Var2.h1());
                            c6Var2.C0(j7Var2.j1());
                            qeVar2.F0().K0(c6Var2, false, false);
                            qeVar2.F0().s0();
                            qeVar2.F0().t0();
                            return qeVar2.K0().V(((com.google.android.gms.internal.measurement.i7) f7Var.r()).g());
                        }
                        try {
                            j7VarJ0.L(za.m((String) pairM.first, Long.toString(zzbgVar.f110861d)));
                            Object obj2 = pairM.second;
                            if (obj2 != null) {
                                j7VarJ0.O(((Boolean) obj2).booleanValue());
                            }
                            h7 h7Var5 = zaVarJ0.f110184a;
                            h7Var5.K().l();
                            j7VarJ0.A(Build.MODEL);
                            h7Var5.K().l();
                            j7VarJ0.z(Build.VERSION.RELEASE);
                            j7VarJ0.D((int) h7Var5.K().o());
                            j7VarJ0.C(h7Var5.K().p());
                            if (r8VarG.o(q8.ANALYTICS_STORAGE)) {
                                j7VarJ0.S(za.m((String) com.google.android.gms.common.internal.w.r(c6VarJ0.p0()), Long.toString(zzbgVar.f110861d)));
                            }
                            if (!TextUtils.isEmpty(c6VarJ0.x0())) {
                                j7VarJ0.v0((String) com.google.android.gms.common.internal.w.r(c6VarJ0.x0()));
                            }
                            strO0 = c6VarJ0.o0();
                            qeVar2 = zaVarJ0.f110700b;
                            listC0 = qeVar2.F0().C0(strO0);
                            it = listC0.iterator();
                            do {
                                if (!it.hasNext()) {
                                    xeVar = null;
                                    break;
                                }
                                xeVar = (xe) it.next();
                            } while (!"_lte".equals(xeVar.f110703c));
                            if (xeVar != null) {
                                xe xeVar4 = new xe(strO0, "auto", "_lte", zaVarJ0.f110184a.e().currentTimeMillis(), 0L);
                                listC0.add(xeVar4);
                                qeVar2.F0().A0(xeVar4);
                            } else {
                                xe xeVar5 = new xe(strO0, "auto", "_lte", zaVarJ0.f110184a.e().currentTimeMillis(), 0L);
                                listC0.add(xeVar5);
                                qeVar2.F0().A0(xeVar5);
                            }
                            b8VarArr = new com.google.android.gms.internal.measurement.b8[listC0.size()];
                            while (i10 < listC0.size()) {
                                com.google.android.gms.internal.measurement.a8 a8VarP2 = com.google.android.gms.internal.measurement.b8.P();
                                a8VarP2.v(((xe) listC0.get(i10)).f110703c);
                                a8VarP2.u(((xe) listC0.get(i10)).f110704d);
                                qeVar2.K0().G(a8VarP2, ((xe) listC0.get(i10)).f110705e);
                                b8VarArr[i10] = (com.google.android.gms.internal.measurement.b8) a8VarP2.r();
                            }
                            j7VarJ0.d1(Arrays.asList(b8VarArr));
                            qe qeVar5 = zaVarJ0.f110700b;
                            qeVar5.n(c6VarJ0, j7VarJ0);
                            qeVar5.o(c6VarJ0, j7VarJ0);
                            x5 x5VarA2 = x5.a(zzbgVar);
                            h7Var = zaVarJ0.f110184a;
                            ze zeVarC2 = h7Var.C();
                            bundle = x5VarA2.f110667d;
                            zeVarC2.w(bundle, qeVar2.F0().G(str4));
                            h7Var.C().u(x5VarA2, h7Var.w().w(str4));
                            bundle.putLong("_c", 1L);
                            h7Var.a().v().a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.f110860c;
                            bundle.putString("_o", str);
                            if (h7Var.C().P(j7VarJ0.F(), c6VarJ0.l0())) {
                                h7Var.C().A(bundle, "_dbg", 1L);
                                h7Var.C().A(bundle, "_r", 1L);
                            }
                            t tVarF1 = qeVar2.F0();
                            str2 = zzbgVar.f110858a;
                            b0VarV0 = tVarF1.v0(str4, str2);
                            if (b0VarV0 == null) {
                                c6Var = c6VarJ0;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                j7Var = j7VarJ0;
                                b0VarA = new b0(str4, str2, 0L, 0L, 0L, zzbgVar.f110861d, 0L, null, null, null, null);
                                j10 = 0;
                                f7Var = f7VarL;
                            } else {
                                f7Var = f7VarL;
                                j7Var = j7VarJ0;
                                c6Var = c6VarJ0;
                                str3 = str;
                                bundle2 = bundle;
                                obj = null;
                                long j13 = b0VarV0.f109769f;
                                b0VarA = b0VarV0.a(zzbgVar.f110861d);
                                j10 = j13;
                            }
                            qeVar2.F0().w0(b0VarA);
                            j7Var2 = j7Var;
                            h7 h7Var6 = zaVarJ0.f110184a;
                            long j14 = zzbgVar.f110861d;
                            c6 c6Var3 = c6Var;
                            a0 a0Var2 = new a0(h7Var6, str3, str4, str2, j14, j10, bundle2);
                            x6VarO = com.google.android.gms.internal.measurement.y6.O();
                            x6VarO.J(a0Var2.f109733d);
                            x6VarO.G(a0Var2.f109731b);
                            x6VarO.L(a0Var2.f109734e);
                            zzbeVar = a0Var2.f109735f;
                            c0Var = new c0(zzbeVar);
                            while (c0Var.hasNext()) {
                                String next2 = c0Var.next();
                                b7VarQ = com.google.android.gms.internal.measurement.c7.Q();
                                b7VarQ.v(next2);
                                objO1 = zzbeVar.O1(next2);
                                if (objO1 != null) {
                                    qeVar2.K0().H(b7VarQ, objO1);
                                    x6VarO.B(b7VarQ);
                                }
                            }
                            j7Var2.T0(x6VarO);
                            com.google.android.gms.internal.measurement.l7 l7VarE2 = com.google.android.gms.internal.measurement.n7.E();
                            com.google.android.gms.internal.measurement.z6 z6VarE2 = com.google.android.gms.internal.measurement.a7.E();
                            z6VarE2.v(b0VarA.f109766c);
                            z6VarE2.u(str2);
                            l7VarE2.u(z6VarE2);
                            j7Var2.D0(l7VarE2);
                            j7Var2.t0(qeVar2.I0().m(c6Var3.o0(), Collections.EMPTY_LIST, j7Var2.X0(), Long.valueOf(x6VarO.I()), Long.valueOf(x6VarO.I()), false));
                            if (x6VarO.H()) {
                                j7Var2.i1(x6VarO.I());
                                j7Var2.k1(x6VarO.I());
                            }
                            jB0 = c6Var3.B0();
                            if (jB0 != 0) {
                                j7Var2.u(jB0);
                            }
                            jZ0 = c6Var3.z0();
                            if (jZ0 != 0) {
                                j7Var2.l1(jZ0);
                            } else if (jB0 != 0) {
                                j7Var2.l1(jB0);
                            }
                            strT0 = c6Var3.t0();
                            sg.a();
                            if (h7Var.w().H(str4, z4.N0)) {
                                j7Var2.I0(strT0);
                            }
                            c6Var3.l();
                            j7Var2.V((int) c6Var3.g());
                            h7Var.w().A();
                            j7Var2.J(133005L);
                            j7Var2.f1(h7Var.e().currentTimeMillis());
                            j7Var2.s0(true);
                            qeVar5.x(j7Var2.F(), j7Var2);
                            f7Var.z(j7Var2);
                            c6Var3.A0(j7Var2.h1());
                            c6Var3.C0(j7Var2.j1());
                            qeVar2.F0().K0(c6Var3, false, false);
                            qeVar2.F0().s0();
                            qeVar2.F0().t0();
                            return qeVar2.K0().V(((com.google.android.gms.internal.measurement.i7) f7Var.r()).g());
                        } catch (SecurityException e10) {
                            zaVarJ0.f110184a.a().v().b("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            qeVar = zaVarJ0.f110700b;
                        }
                    } else {
                        h7 h7Var7 = zaVarJ0.f110184a;
                        h7Var7.K().l();
                        j7VarJ0.A(Build.MODEL);
                        h7Var7.K().l();
                        j7VarJ0.z(Build.VERSION.RELEASE);
                        j7VarJ0.D((int) h7Var7.K().o());
                        j7VarJ0.C(h7Var7.K().p());
                        try {
                            if (r8VarG.o(q8.ANALYTICS_STORAGE) && c6VarJ0.p0() != null) {
                                j7VarJ0.S(za.m((String) com.google.android.gms.common.internal.w.r(c6VarJ0.p0()), Long.toString(zzbgVar.f110861d)));
                            }
                            if (!TextUtils.isEmpty(c6VarJ0.x0())) {
                                j7VarJ0.v0((String) com.google.android.gms.common.internal.w.r(c6VarJ0.x0()));
                            }
                            strO0 = c6VarJ0.o0();
                            qeVar2 = zaVarJ0.f110700b;
                            listC0 = qeVar2.F0().C0(strO0);
                            it = listC0.iterator();
                            do {
                                if (!it.hasNext()) {
                                    xeVar = null;
                                    break;
                                }
                                xeVar = (xe) it.next();
                            } while (!"_lte".equals(xeVar.f110703c));
                            if (xeVar != null || xeVar.f110705e == null) {
                                xe xeVar6 = new xe(strO0, "auto", "_lte", zaVarJ0.f110184a.e().currentTimeMillis(), 0L);
                                listC0.add(xeVar6);
                                qeVar2.F0().A0(xeVar6);
                            }
                            b8VarArr = new com.google.android.gms.internal.measurement.b8[listC0.size()];
                            while (i10 < listC0.size()) {
                                com.google.android.gms.internal.measurement.a8 a8VarP3 = com.google.android.gms.internal.measurement.b8.P();
                                a8VarP3.v(((xe) listC0.get(i10)).f110703c);
                                a8VarP3.u(((xe) listC0.get(i10)).f110704d);
                                qeVar2.K0().G(a8VarP3, ((xe) listC0.get(i10)).f110705e);
                                b8VarArr[i10] = (com.google.android.gms.internal.measurement.b8) a8VarP3.r();
                            }
                            j7VarJ0.d1(Arrays.asList(b8VarArr));
                            qe qeVar6 = zaVarJ0.f110700b;
                            qeVar6.n(c6VarJ0, j7VarJ0);
                            qeVar6.o(c6VarJ0, j7VarJ0);
                            x5 x5VarA3 = x5.a(zzbgVar);
                            h7Var = zaVarJ0.f110184a;
                            ze zeVarC3 = h7Var.C();
                            bundle = x5VarA3.f110667d;
                            zeVarC3.w(bundle, qeVar2.F0().G(str4));
                            h7Var.C().u(x5VarA3, h7Var.w().w(str4));
                            bundle.putLong("_c", 1L);
                            h7Var.a().v().a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbgVar.f110860c;
                            bundle.putString("_o", str);
                            if (h7Var.C().P(j7VarJ0.F(), c6VarJ0.l0())) {
                                h7Var.C().A(bundle, "_dbg", 1L);
                                h7Var.C().A(bundle, "_r", 1L);
                            }
                            t tVarF2 = qeVar2.F0();
                            str2 = zzbgVar.f110858a;
                            b0VarV0 = tVarF2.v0(str4, str2);
                            if (b0VarV0 == null) {
                                c6Var = c6VarJ0;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                j7Var = j7VarJ0;
                                b0VarA = new b0(str4, str2, 0L, 0L, 0L, zzbgVar.f110861d, 0L, null, null, null, null);
                                j10 = 0;
                                f7Var = f7VarL;
                            } else {
                                f7Var = f7VarL;
                                j7Var = j7VarJ0;
                                c6Var = c6VarJ0;
                                str3 = str;
                                bundle2 = bundle;
                                obj = null;
                                long j15 = b0VarV0.f109769f;
                                b0VarA = b0VarV0.a(zzbgVar.f110861d);
                                j10 = j15;
                            }
                            qeVar2.F0().w0(b0VarA);
                            j7Var2 = j7Var;
                            h7 h7Var8 = zaVarJ0.f110184a;
                            long j16 = zzbgVar.f110861d;
                            c6 c6Var4 = c6Var;
                            a0 a0Var3 = new a0(h7Var8, str3, str4, str2, j16, j10, bundle2);
                            x6VarO = com.google.android.gms.internal.measurement.y6.O();
                            x6VarO.J(a0Var3.f109733d);
                            x6VarO.G(a0Var3.f109731b);
                            x6VarO.L(a0Var3.f109734e);
                            zzbeVar = a0Var3.f109735f;
                            c0Var = new c0(zzbeVar);
                            while (c0Var.hasNext()) {
                                String next3 = c0Var.next();
                                b7VarQ = com.google.android.gms.internal.measurement.c7.Q();
                                b7VarQ.v(next3);
                                objO1 = zzbeVar.O1(next3);
                                if (objO1 != null) {
                                    qeVar2.K0().H(b7VarQ, objO1);
                                    x6VarO.B(b7VarQ);
                                }
                            }
                            j7Var2.T0(x6VarO);
                            com.google.android.gms.internal.measurement.l7 l7VarE3 = com.google.android.gms.internal.measurement.n7.E();
                            com.google.android.gms.internal.measurement.z6 z6VarE3 = com.google.android.gms.internal.measurement.a7.E();
                            z6VarE3.v(b0VarA.f109766c);
                            z6VarE3.u(str2);
                            l7VarE3.u(z6VarE3);
                            j7Var2.D0(l7VarE3);
                            j7Var2.t0(qeVar2.I0().m(c6Var4.o0(), Collections.EMPTY_LIST, j7Var2.X0(), Long.valueOf(x6VarO.I()), Long.valueOf(x6VarO.I()), false));
                            if (x6VarO.H()) {
                                j7Var2.i1(x6VarO.I());
                                j7Var2.k1(x6VarO.I());
                            }
                            jB0 = c6Var4.B0();
                            if (jB0 != 0) {
                                j7Var2.u(jB0);
                            }
                            jZ0 = c6Var4.z0();
                            if (jZ0 != 0) {
                                j7Var2.l1(jZ0);
                            } else if (jB0 != 0) {
                                j7Var2.l1(jB0);
                            }
                            strT0 = c6Var4.t0();
                            sg.a();
                            if (h7Var.w().H(str4, z4.N0) && strT0 != null) {
                                j7Var2.I0(strT0);
                            }
                            c6Var4.l();
                            j7Var2.V((int) c6Var4.g());
                            h7Var.w().A();
                            j7Var2.J(133005L);
                            j7Var2.f1(h7Var.e().currentTimeMillis());
                            j7Var2.s0(true);
                            qeVar6.x(j7Var2.F(), j7Var2);
                            f7Var.z(j7Var2);
                            c6Var4.A0(j7Var2.h1());
                            c6Var4.C0(j7Var2.j1());
                            qeVar2.F0().K0(c6Var4, false, false);
                            qeVar2.F0().s0();
                            qeVar2.F0().t0();
                            try {
                                return qeVar2.K0().V(((com.google.android.gms.internal.measurement.i7) f7Var.r()).g());
                            } catch (IOException e11) {
                                zaVarJ0.f110184a.a().o().c("Data loss. Failed to bundle and serialize. appId", w5.x(str4), e11);
                                return obj;
                            }
                        } catch (SecurityException e12) {
                            zaVarJ0.f110184a.a().v().b("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            qeVar = zaVarJ0.f110700b;
                        }
                    }
                    qeVar.F0().t0();
                    return bArr;
                }
                zaVarJ0.f110184a.a().v().b("Log and bundle disabled. package_name", str4);
                bArr2 = new byte[0];
            }
            qeVar3.F0().t0();
            return bArr2;
        } catch (Throwable th2) {
            zaVarJ0.f110700b.F0().t0();
            throw th2;
        }
    }
}
