# OnePlus 6 Night Mode bug description

## Scenario: `Night mode` is `On`
When `Night mode` is `On`
And an activity with wide color gamut mode is launched
Then the screen color temperature changes as if `Night mode` wouldn't be enabled
And the only way to fix it is to toggle `Night mode` `On` and `Off`

## Scenario: `Night mode` is `Off`
When `Night mode` is `Off`
And an activity with wide color gamut mode is launched
Then the screen color temperature changes as if `Night mode` would be enabled
And closing the activiy reverts the screen to the previous color temperature

## Remarks
The issue only seem to present itself when wide color gamut mode is enabled in the manifest file with `android:colorMode="wideColorGamut"` and not when using `setColorMode(COLOR_MODE_WIDE_COLOR_GAMUT)`

# Environment
Device: OnePlus A6003

Version: ONEPLUS A6003_22_181026