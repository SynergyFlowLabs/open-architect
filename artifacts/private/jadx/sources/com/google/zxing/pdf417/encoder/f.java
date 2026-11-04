package com.google.zxing.pdf417.encoder;

import androidx.compose.runtime.m0;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.view.f0;
import androidx.media3.exoplayer.a5;
import com.facebook.internal.p;
import com.google.android.material.internal.p0;
import com.google.android.vending.licensing.k;
import com.google.api.client.http.a0;
import com.google.zxing.w;
import io.sentry.r0;

/* JADX INFO: loaded from: classes5.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f130851a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, r0.f306611d, 524, 801, 132, 295, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, com.badlogic.gdx.utils.compression.lzma.a.A, 494, 263, com.planner5d.library.engine.input.f.b.F1, 593, 800, 571, com.rabbitmq.client.a.f264844o, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, com.planner5d.library.engine.input.f.b.f160742x1, v.e.f44057z, 287, com.planner5d.library.engine.input.f.b.f160745y1, 505, 733, 877, 381, v.e.B, 723, 476, 462, 172, 430, v.e.f44056y, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, v.e.f44052u, androidx.media2.widget.f.i.f59801t0, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, aa.a.f564b, 244, 583, 620, com.planner5d.library.engine.input.f.b.P1, com.planner5d.library.engine.input.f.b.G1, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 96, 684, 432, 686, v.e.f44053v, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, androidx.media2.widget.f.i.f59797r0, 732, 95, 270, 447, 90, v.g.f44095o, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, v.e.f44049r, 754, 336, 89, 614, 87, 432, 670, 616, androidx.media2.widget.f.i.f59799s0, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, v.b.f43998o, 786, 138, 720, 858, 194, 311, 913, 275, p.f100029m, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, v.e.f44052u, com.rabbitmq.client.a.f264853x, 913, 801, 700, 799, androidx.media2.widget.f.i.f59767c0, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, k.f115074c, 803, 712, 19, 358, 399, 908, com.planner5d.library.engine.input.f.b.f160733u1, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, v.b.f43999p, 90, 2, 290, 743, 199, 655, v.b.f43996m, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, com.rabbitmq.client.a.f264844o, 479, 130, 739, 71, 263, v.a.f43976s, 374, 601, 192, v.e.f44052u, androidx.media2.widget.f.i.f59777h0, 673, 687, 234, 722, a5.S0, 177, 752, v.e.f44054w, 640, 455, 193, 689, v.h.f44116q, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, okhttp3.internal.ws.g.f334652s, 32, 681, 331, 792, 620, 60, v.e.f44056y, 441, 180, 791, 893, 754, v.e.f44052u, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, v.e.f44056y, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, com.planner5d.library.engine.input.f.b.U1, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, r0.f306611d, 428, m0.f36245r, a0.f115563p, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, com.planner5d.library.widget.editor.editor2d.drawable.c.f254878a, com.planner5d.library.engine.input.f.b.S1, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, com.badlogic.gdx.utils.compression.lzma.a.f95331z, 383, 800, 485, 98, 752, 472, 761, com.planner5d.library.engine.input.f.b.f160745y1, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, androidx.media2.widget.f.i.f59777h0, 808, 684, 287, 536, k.f115073b, 76, 653, 899, 729, 567, 744, 390, f0.f48707j, 192, 516, 258, 240, 518, 794, 395, p0.f112892a, 848, 51, v.e.f44057z, a5.S0, 168, p.f100029m, 826, 328, 596, 786, 303, 570, 381, 415, 641, androidx.media2.widget.f.i.f59797r0, 237, 151, 429, 531, m0.f36245r, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, v.h.f44116q, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, com.planner5d.library.engine.input.f.b.R1, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, v.c.f44017r, com.planner5d.library.engine.input.f.b.O1, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, androidx.media2.widget.f.i.f59801t0, 209, 563, 564, 343, 693, 109, v.e.f44055x, 563, 365, 181, 772, 677, 310, com.planner5d.library.engine.input.f.b.R1, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, v.c.f44021v, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, com.planner5d.library.engine.input.f.b.Q1, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, v.b.f43998o, 789, v.c.f44017r, 305, 441, m0.f36245r, 300, 892, 827, androidx.media2.widget.f.i.f59775g0, 537, 381, 662, f0.f48707j, 56, com.planner5d.library.engine.input.f.b.V1, p.f100031o, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, com.planner5d.library.widget.editor.editor2d.drawable.c.f254879b, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, v.c.f44022w, 216, 548, com.planner5d.library.engine.input.f.b.S1, 321, 881, 699, 535, 673, 782, 210, 815, v.b.f43998o, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, v.c.f44022w, 535, 336, 286, 437, 375, com.badlogic.gdx.utils.compression.lzma.a.A, v.e.f44057z, 296, 183, 923, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, v.c.f44021v, 242, 749, 321, 54, 669, v.a.f43974q, 342, 299, 534, 105, 667, 488, 640, 672, 576, com.rabbitmq.client.a.f264853x, v.a.f43974q, 486, 721, v.e.f44057z, 46, 656, 447, 171, 616, 464, p.f100029m, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, com.rabbitmq.client.impl.k.b.p.f265340a, 20, 596, 284, 736, 138, 646, 411, 877, 669, androidx.media2.widget.f.i.f59775g0, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, p0.f112892a, 223, 849, 647, 63, 310, 863, com.planner5d.library.engine.input.f.b.U1, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};

    private f() {
    }

    static String a(CharSequence charSequence, int i10) {
        int iB = b(i10);
        char[] cArr = new char[iB];
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = iB - 1;
            int iCharAt = (charSequence.charAt(i11) + cArr[i12]) % aa.a.f563a;
            while (i12 > 0) {
                cArr[i12] = (char) ((cArr[i12 - 1] + (929 - ((f130851a[i10][i12] * iCharAt) % aa.a.f563a))) % aa.a.f563a);
                i12--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * f130851a[i10][0]) % aa.a.f563a)) % aa.a.f563a);
        }
        StringBuilder sb2 = new StringBuilder(iB);
        for (int i13 = iB - 1; i13 >= 0; i13--) {
            char c10 = cArr[i13];
            if (c10 != 0) {
                cArr[i13] = (char) (929 - c10);
            }
            sb2.append(cArr[i13]);
        }
        return sb2.toString();
    }

    static int b(int i10) {
        if (i10 < 0 || i10 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i10 + 1);
    }

    static int c(int i10) throws w {
        if (i10 <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i10 <= 40) {
            return 2;
        }
        if (i10 <= 160) {
            return 3;
        }
        if (i10 <= 320) {
            return 4;
        }
        if (i10 <= 863) {
            return 5;
        }
        throw new w("No recommendation possible");
    }
}
