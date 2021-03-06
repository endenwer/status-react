(ns status-im.ui.screens.profile.components.styles
  (:require-macros [status-im.utils.styles :refer [defstyle]])
  (:require [status-im.ui.components.styles :as styles]
            [status-im.ui.components.colors :as colors]))

;; profile header elements

(def profile-header-display
  {:flex-direction  :column
   :justify-content :center
   :align-items     :center})

(def profile-header-edit
  {:flex-direction  :column
   :justify-content :center})

(defstyle profile-name-text
  {:padding-vertical 14
   :font-size        15
   :text-align       :center
   :ios              {:letter-spacing -0.2}
   :android          {:color colors/black}})

(defstyle profile-name-input-text
  {:font-size  15
   :text-align :center
   :flex       1
   :ios        {:letter-spacing      -0.2
                :height              46
                :border-bottom-width 1
                :border-bottom-color colors/gray-light}
   :android    {:color               colors/black
                :border-bottom-width 2
                :border-bottom-color colors/blue}})

(def profile-header-name-container
  {:flex            1
   :justify-content :center})

;; settings items elements

(def settings-item-separator
  {:margin-left 16})

(def settings-item
  {:padding-horizontal 16
   :flex               1
   :flex-direction     :row
   :align-items        :center
   :background-color   colors/white
   :height             52})

(def settings-item-text-wrapper
  {:flex             1
   :flex-direction   :row
   :justify-content  :space-between})

(defstyle settings-item-text
  {:flex-wrap :nowrap
   :font-size 15
   :ios       {:letter-spacing -0.2}
   :android   {:color colors/black}})

(def settings-item-destructive
  {:color colors/red})

(def settings-item-value
  {:flex          1
   :flex-wrap     :nowrap
   :text-align    :right
   :padding-right 10
   :font-size     15
   :color         colors/gray})

(defstyle settings-title
  {:color         colors/gray
   :margin-left   16
   :margin-top    18
   :font-size     14
   :ios           {:letter-spacing -0.2}})

;; shared profile styles

(def modal-menu
  {:align-items :center})

(def profile
  {:flex             1
   :background-color colors/white
   :flex-direction   :column})

(def profile-form
  {:background-color colors/white
   :padding          16})
