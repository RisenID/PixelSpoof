# PixelSpoof

## What is PixelSpoof?
PixelSpoof is a module for LSPosed that lets you spoof all device-specific properties of your device, selectively for individual apps, to a high end Pixel device (Currently Pixel 8 Pro)

## How to install
### Prerequisites
To use this module you must have one of the following (latest versions):
- [Magisk](https://github.com/topjohnwu/Magisk) with Zygisk enabled
    - IMPORTANT: DO NOT add apps that you want to spoof to Magisk's denyList as that will break the module.
- [KernelSU](https://github.com/tiann/KernelSU) with [ZygiskNext](https://github.com/Dr-TSNG/ZygiskNext) module installed
- [APatch](https://github.com/bmax121/APatch) with [ZygiskNext MOD](https://github.com/Yervant7/ZygiskNext) module installed
You must also have [LSPosed](https://github.com/LSPosed/LSPosed) installed

### Installation
- Download the latest APK of PixelSpoof from the [releases section](https://github.com/RisenID/PixelSpoof/releases) and install it like any normal APK.
- Now open the LSPosed Manager and go to "Modules".
- PixelSpoof should now appear in that list.
- Click on PixelSpoof and enable the module by flipping the switch at the top that says "Enable module".
- Next, tick all the apps that you want to spoof details for and reboot your phone afterwards.
- Once rebooted, you should be able to successfully open your apps.

## FAQ and issues
### The wearable app asks me to download the plugin from the Play Store
After the installation finishes, open the LSPosed Manager and add the app to the PixelSpoof module. Reboot afterwards. You might need to clear cache and data of the app you want to spoof too.