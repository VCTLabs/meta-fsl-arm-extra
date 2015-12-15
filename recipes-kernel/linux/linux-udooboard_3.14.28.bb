# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-udooboard.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# UDOOboard branch - based on 3.14.28_1.0.0_ga from Freescale git

SRCBRANCH_udooneo = "imx_3.14.28_1.0.0_ga_neo"
SRCBRANCH_udooquad = "3.14-1.0.x-udoo"
SRCREV_udooneo = "b15f827aa37a1ca71ca4e3b5c0de1c4da4a3de67"
SRCREV_udooquad = "56eada2ecc328c451c5d2e7ef1963e60179333a0"
LOCALVERSION = "_1.0.0_ga-udooboard"

B = "${S}"

COMPATIBLE_MACHINE = "(udooneo|udooquad)"
